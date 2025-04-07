package java_collections_streams.annotation.custom.role_based_access_control;

public class Main {
    public static void main(String[] args) {
        AdminService service = new AdminService();

        UserContext.setCurrentUserRole("ADMIN");
        AccessController.invokeMethod(service, "performAdminTask");

        UserContext.setCurrentUserRole("USER");
        AccessController.invokeMethod(service, "performAdminTask");


    }
}
