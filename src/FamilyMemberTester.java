public class FamilyMemberTester {
    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember(); // obiekt klasy FamMem
        dad.name = "Karol";
        dad.age = 34;
        dad.surname = "Kowalski"; // co tu sie stało? zmienna static, która jest wspólnba dla całej klasy w przypadku zmiany
        // na jednym obiekcie zmienia wszystkim obiektom bo po prostu one z tego korzystają,
        // bo to nie jest przechowywane w zmiennej tylko w jakims centralnymmiejscu
        System.out.println("Nazwisko rodowe to " + dad.surname); // w tymprzypadku musimy stworzyc nowego czlonka rodziny
        System.out.println("Nazwisko rodowe to " + FamilyMember.surname); // tu tego nie trzena

        FamilyMember mom = new FamilyMember();
        mom.name = "Dorota";
        mom.age = 30;
        System.out.println("Nazwisko rodowe to " + mom.surname);
        System.out.println("Nazwisko rodowe to " + FamilyMember.surname);


    }
}
