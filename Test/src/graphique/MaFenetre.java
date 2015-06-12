package graphique;

import javax.swing.* ;      // pour JFrame
import java.awt.event.* ;   // pour MouseEvent et MouseListener
class MaFenetre extends JFrame implements MouseListener
{ public MaFenetre ()    // constructeur
  { setTitle ("Gestion de clics") ;
    setBounds (10, 20, 300, 200) ;
        addMouseListener (this) ;   // la fenetre sera son propre écouteur
                                    // d’événements souris
      }
      public void mouseClicked(MouseEvent ev){   // méthode gerant un clic souris
      int x = ev.getX();
      int y = ev.getY();
      
      System.out.println ("clic au point de coordonnees " + x + ", " + y )  ;
      }
      public void mousePressed (MouseEvent ev) {}
      public void mouseReleased(MouseEvent ev) {}
      public void mouseEntered (MouseEvent ev) {}
      public void mouseExited  (MouseEvent ev) {}
    }
   