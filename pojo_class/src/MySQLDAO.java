import java.util.ArrayList;
import java.util.List;

public class MySQLDAO implements CRUDInteface {
    Developer developer;
    List<Developer> Developers;

    MySQLDAO(Developer developer){
        Developers = new ArrayList<>();
        Developers.add(developer);
    }

    @Override
    public List<Developer> getAllDevelopers() {
        return Developers;
    }

    @Override
    public Developer getDeveloper(int DeveloperId) {
        return null;
    }

    @Override
    public void updateDeveloper(Developer Developer) {

    }

    @Override
    public void deleteDeveloper(Developer Developer) {

    }
}
