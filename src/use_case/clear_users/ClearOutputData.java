package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {

    private String[] deletedUsers;

    public ClearOutputData(String[] deletedUsers){
        this.deletedUsers = deletedUsers;
    }

    public String[] getDeletedUsers(){
        return this.deletedUsers;
    }

}
