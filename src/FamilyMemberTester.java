public class FamilyMemberTester {
    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember(); // obiekt klasy FamMem
        System.out.println("Nazwisko rodowe to " + dad.surname);
        System.out.println("Nazwisko rodowe to " + FamilyMember.surname);
    }
}
