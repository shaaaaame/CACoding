package use_case.clear_users;

import entity.User;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface clearDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessObject,
                           ClearOutputBoundary clearPresenter) {
        this.clearDataAccessObject = clearDataAccessObject;
        this.clearPresenter = clearPresenter;
    }

    @Override
    public void execute() {

        String[] deletedUsers  = clearDataAccessObject.deleteUsers();

        ClearOutputData clearOutputData = new ClearOutputData(deletedUsers);

        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
