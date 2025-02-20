package somethingrandom.interfaceadapters.additem;
import somethingrandom.usecase.AddItemInputBoundary;
import somethingrandom.usecase.AddItemInputData;
import java.util.Date;
public class AddItemController {

    final AddItemInputBoundary addItemUseCaseInteractor;
    public AddItemController(AddItemInputBoundary addItemUseCaseInteractor) {
        this.addItemUseCaseInteractor = addItemUseCaseInteractor;
    }
    public void execute(String item, String description) {
        AddItemInputData addItemInputData = new AddItemInputData(item, description);
        addItemUseCaseInteractor.execute(addItemInputData);
    }
}
