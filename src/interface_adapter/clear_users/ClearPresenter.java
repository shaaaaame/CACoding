package interface_adapter.clear_users;

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                          ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData response) {
        // On success, set clearViewModel state to users.

        ClearState clearState = clearViewModel.getState();
        clearState.setDeletedUsers(response.getDeletedUsers());
        this.clearViewModel.setState(clearState);


    }
}
