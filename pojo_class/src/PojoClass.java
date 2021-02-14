public class PojoClass {
    public static void main(String[] args) {
        Developer developer = new Developer("Prakhar Bansal");
        CRUDInteface crudInteface = new MySQLDAO(developer);
        for (Developer developer1 : crudInteface.getAllDevelopers()){
            System.out.println(developer1.toString());
        }
    }
}
