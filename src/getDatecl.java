public class getDatecl {
    public static void main(String[] args) {
        System.out.println("\n java.time.LocalDate.now() Ngay hien tai : ");
        System.out.println(java.time.LocalDate.now() + "\n");

        System.out.println("java.time.LocalTime.now() Gio hien tai : ");
        System.out.println(java.time.LocalTime.now() + "\n");

        System.out.println("1> java.time.LocalDateTime.now() Ngay + gio hien tai : ");
        System.out.println(java.time.LocalDateTime.now() + "\n");

        System.out.println("2> java.time.Clock.systemUTC().instant() Ngay + gio hien tai : \n" + java.time.Clock.systemUTC().instant() + "\n");


        System.out.println("3> java.util.Date date Ngay + gio hien tai : ");
        java.util.Date date = new java.util.Date();
        System.out.println(date +"\n");
    }

}
