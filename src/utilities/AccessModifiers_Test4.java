package utilities;

import day40_FinalWord.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {

        System.out.println(AccessModifiers_Test4.name2);
       // System.out.println(AccessModifiers_Test4.name1); default is not visible outside of the package
        AccessModifiers_Test4.method2();
     //   AccessModifiers_Test4.method1();//default is not visible outside of the package
    }



}
