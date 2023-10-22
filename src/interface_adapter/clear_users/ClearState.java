package interface_adapter.clear_users;

// TODO Complete me
public class ClearState {
    private String[] deletedUsers = null;

    public ClearState(ClearState copy) {
        deletedUsers = copy.deletedUsers;
    }

    // Because of the previous copy constructor, the default constructor must be explicit.
    public ClearState() {}

    public String[] getDeletedUsers() {
        return deletedUsers;
    }

    public void setDeletedUsers(String[] deletedUsers){ this.deletedUsers = deletedUsers; }
}
