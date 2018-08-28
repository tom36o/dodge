public class dodge extends JPanel{


    public dodge(){
        setSize(new Dimension(500 , 400));
        setPreferredSize(new Dimension(500 , 400));
        //setBackground(Color.blue);
    }
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(0 , 0 , getWidth() , getHeight());
        g.setColor(Color.black);
        g.drawString("this is my string" , 20 , 20);
        System.out.println("this will be for infinite time untill u close the app");
        repaint();
    }

    public static void main(String args[]){
        dodge game = new dodge();
        JFrame frame = new JFrame("this is my new game");
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
