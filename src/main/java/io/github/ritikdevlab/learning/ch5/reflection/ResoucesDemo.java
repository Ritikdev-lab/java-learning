package io.github.ritikdevlab.learning.ch5.reflection;

import module java.base;
import module java.desktop;

public class ResoucesDemo {
    void main() throws Exception {
        URL aboutUrl = getClass().getResource("/images/about.png");
        var icon = new ImageIcon(aboutUrl);

        InputStream stream = getClass().getResourceAsStream("/data/about.txt");
        var about = new String(stream.readAllBytes());

        InputStream stream2 = getClass().getResourceAsStream("/data/title.txt");
        var title = new String(stream2.readAllBytes()).strip();

        JOptionPane.showMessageDialog(null, about, title, JOptionPane.INFORMATION_MESSAGE, icon);
        // For running command
        // 1-> cd ~/Desktop/java-learning/target/classes
        // 2-> java io.github.ritikdevlab.learning.ch5.reflection.ResoucesDemo

    }
}
