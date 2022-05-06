
import javafx.application.*;  
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.StackPane;  
 class Javafx extends Application{  
    
    public void start(Stage s) throws Exception {  
        
        Button btn1=new Button("Say, Hello World");  
	btn1.setOnAction(new EventHandler<ActionEvent>() {  
            
            public void handle(ActionEvent arg0) {  
                  
                System.out.println("hello world");  
            }  
        });  
       StackPane p=new StackPane();  
        p.getChildren().add(btn1);  
        Scene sc=new Scene(p,600,400);      
	s.setTitle("First JavaFX Application");  
        s.setScene(sc);  
        s.show();  
    }  
    public static void main (String[] args)  
    {  
        launch(args);  
    }   
}  
