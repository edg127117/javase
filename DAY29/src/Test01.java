import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ResourceBundle;

public class Test01 {
    public static void main(String[] args) throws IOException {
        ResourceBundle bundle=ResourceBundle.getBundle("config");
        String className = bundle.getString("class.name");
        String packageName=className.substring(0,className.lastIndexOf("."));
        className=className.substring(className.lastIndexOf(".")+1);
        StringBuilder stringBuilder=new StringBuilder("package "+packageName+";\n");
        stringBuilder.append("public class ").append(className).append("{\n");
        String propertiesName=bundle.getString("property.names");
        String propertiesType=bundle.getString("property.types");
        String[] propertiesNames=propertiesName.split(",");
        String[] propertiesTypes=propertiesType.split(",");
        StringBuilder argsBuilder=new StringBuilder();
        for (int i = 0; i < propertiesNames.length; i++) {
            stringBuilder.append("\tprivate ").append(propertiesTypes[i]).append(" ")
                    .append(propertiesNames[i]).append(";\n");
            argsBuilder.append(propertiesTypes[i])
                    .append(" ").append(propertiesNames[i]).append(",");
        }
        stringBuilder.append("\tpublic ").append(className)
                .append("(){\n\t}\n");
        argsBuilder.setCharAt(argsBuilder.length()-1,')');
        stringBuilder.append("\tpublic ").append(className).append("(")
                .append(argsBuilder).append("{\n");
        for (String name : propertiesNames) {
            stringBuilder.append("\t\tthis.").append(name).append("=").append(name).append(";\n");
        }
        stringBuilder.append("\t}\n");
        for (int i = 0; i < propertiesNames.length; i++) {
            String property=propertiesNames[i];
            char c = property.charAt(0);
            char c1 = Character.toUpperCase(c);
            property=c1+property.substring(1);
            stringBuilder.append("\tpublic ").append(propertiesTypes[i])
                    .append(" get").append(property).append("()")
                    .append("{\n")
                    .append("\t\t return ").append(propertiesNames[i])
                    .append(";\n\t}\n");
            stringBuilder.append("\tpublic void set").append(property)
                    .append("(").append(propertiesTypes[i]).append(" ")
                    .append(propertiesNames[i]).append("){\n")
                    .append("\t\tthis.").append(propertiesNames[i])
                    .append(" = ").append(propertiesNames[i]).append(";")
                    .append("\n\t}\n");
        }
        stringBuilder.append("\tpublic String toString() {\n")
                .append("\t\treturn \"")
                .append(className).append("{\" + \n");
        for (int i = 0; i < propertiesNames.length; i++) {
            stringBuilder.append("\t\t\t")
                    .append("\"").append(propertiesNames[i])
                    .append("='\" + ").append(propertiesNames[i]);
            if (i==propertiesNames.length-1)      {
                stringBuilder.append("+ \"'}\";\n");
            }else
                stringBuilder.append(" + \"',\"+\n");
        }
        stringBuilder.append("\n\t}\n}");
        String base=System.getProperty("user.dir");
        base+="/day29/src/";
        packageName=packageName.replace(".","/");
        base+=packageName;
        File dir=new File(base);
        dir.mkdirs();
        FileWriter fileWriter=new FileWriter(new File(dir,className+".java"));
        fileWriter.write(stringBuilder.toString());
        fileWriter.close();
    }
}

