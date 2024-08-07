package ui.constants;

import ui.utils.ApplicationProperties;

public enum URL {
    Login("login.jsp"),
    Home("secure/Dashboard.jspa");
//    UserManagement("admin/viewSystemUsers"),
//    UserCreation("admin/saveSystemUser");

    private final String url;
    URL(String path) {
        this.url = ApplicationProperties.get("baseUrl") + path;
    }

    @Override
    public String toString() {
        return url;
    }
}
