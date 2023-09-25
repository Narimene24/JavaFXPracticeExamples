

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleExercice extends Application{
     @Override
        public void start(Stage primaryStage) throws Exception {
    
        // Creer le Noeud ROOT    
        StackPane root = new StackPane();

        // Creer la forme 2D que vous voulez afficher sur le paneau 
       Circle circle = new Circle(300, 300, 200) ;
       circle.setFill(Color.AQUAMARINE);    
        

        //  Définir le Path entre le noeud root et le nouveau noeud Circle

        //ObservableList listNode = root.getChildren();

        //listNode.add(circle);

       root.getChildren().add(circle);

        //  instancier la scene et passer le root du contenue graphique en parametres
        
        Scene scene = new Scene(root);

        //  configurer le Stage 
        primaryStage.setTitle("Dessin cercle");  
        primaryStage.setWidth(600);
        primaryStage.setHeight(600);

        // mettre la scene dans stage et l'afficher

        primaryStage.setScene(scene);
        primaryStage.show();

        
            }
        public static void main (String [] args) {
            launch(args);
        }
    
}
