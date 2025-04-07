package java_collections_streams.reflection.advanced_level.dependency_injection;

public class UserService {
    @Inject
    private DatabaseService dbService;

    public void performAction(){
        dbService.connect();
        System.out.println("performing user action...");
    }
}
