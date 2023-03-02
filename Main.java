public class Main{

    public static void main(String[] args) {
        

            Faculty f = new Faculty();
            f.setMemberName("Jellie");
            f.setMemberSalary(40000);
            f.setDepartmentName("Norima Dev");
    
            System.out.println(f.getMemberName() + "'s salary is" + " " + "PHP" +  f.getMemberSalary() + " " + " and her department is under " + " " + f.getDepartmentName());
    }
}
