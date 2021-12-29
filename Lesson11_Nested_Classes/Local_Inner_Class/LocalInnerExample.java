package Lesson11_Nested_Classes.Local_Inner_Class;

public class LocalInnerExample {
    public static void main(String[] args) {
        Math math1 = new Math();
        math1.getResult(21, 24);

    }
}

class Math {


    public void getResult(int delimoe, int delitelj) {

        class Division {
//            private int delimoe;
//            private int delitelj;

//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

//            public void setDelitelj(int delitelj) {
//                this.delitelj = delitelj;
//            }
//
////            public int getDelimoe() {
////                return delimoe;
////            }
//
//            public int getDelitelj() {
//                return delitelj;
//            }
            public int getChastnoe(){
                return delimoe/delitelj;
            }
            public int getOstatok(){
                return delimoe % delitelj;
            }
        }
        Division del1 =  new Division();
//        del1.setDelimoe(21);
//        del1.setDelitelj(4);
        System.out.println("Delimoe= "+ delimoe);
        System.out.println("Delitelj= "+ delitelj);
        System.out.println("Chastnoe= "+ del1.getChastnoe());
        System.out.println("Ostatok= "+ del1.getOstatok());
    }
}