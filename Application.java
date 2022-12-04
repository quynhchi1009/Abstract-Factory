public class Application {
    private GUIFactory guiFactory;
    private Button button; 
    
    //constructor
    public Application(GUIFactory factory) {
        this.guiFactory = factory;
    }
    
    public void createUI() {
        this.button = guiFactory.createButton();
    }

    public void paint() {
        this.button.paint();
    }
}
