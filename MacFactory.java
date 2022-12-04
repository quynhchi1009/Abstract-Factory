public class MacFactory implements GUIFactory{
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }

    public Button createButton() {
        return new MacButton();
    }
}
