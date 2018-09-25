import javax.swing.*;
public class Main {


        /**{
         * 创建并显示GUI。出于线程安全的考虑，
         * 这个方法在事件调用线程中调用。
         */
        private static void createAndShowGUI() {
            // 确保一个漂亮的外观风格
            JFrame.setDefaultLookAndFeelDecorated(true);

            // 创建及设置窗口
            JFrame frame = new JFrame("HelloWorldSwing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // 添加 "Hello World" 标签
            JLabel label = new JLabel("Hello World");
            JLabel label2 = new JLabel("Hello Worldolilolol");
            frame.getContentPane().add(label);
            frame.getContentPane().add(label2);

            // 显示窗口
            frame.pack();
            frame.setVisible(true);
        }
    public static void main(String[] args) {

        System.out.println("Hello World!"+"\t"+"hello world");

        for(int i=1;i<=9;i++){
            for (int j=1;j<=i;j++)
                System.out.print(j+"*"+i+"="+i*j+";\t");
        System.out.println();
        }

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }
}
