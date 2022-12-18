package dp.VirtualProxyPattern;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class ImageProxyTestDrive {
	ImageComponent imageComponent;
	JFrame frame = new JFrame("CD Cover Viewer");
	JMenuBar menuBar;
	JMenu menu;
	Hashtable<String, String> cds = new Hashtable<String, String>();

	public static void main (String[] args) throws Exception {
		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
	}

	public ImageProxyTestDrive() throws Exception{
		cds.put("Gumble","https://postfiles.pstatic.net/MjAyMjEyMTdfMTEy/MDAxNjcxMjY0NjUwNTcx.peVE96wCcTTzhM6rYBdqZMbNt7tpQCB90ONSsfsbsqkg.O6-dT44R5k79JLgdsb6TfkW0bSMb0qGLnWmBkR1X6C8g.PNG.cjj642/89d17495aacdc331a244fe933fa50621dafe941f7e4d7becf35024040df9239724962b467c11.png?type=w966");
		cds.put("Pricess","https://postfiles.pstatic.net/MjAyMjEyMTZfNTMg/MDAxNjcxMjAyMzMwNzk3.y0EX7lX7C33avanT9faLpoG8HjIQDJmo4shEFZC9Kx0g.Q5hLlal1uAhaaLloFX_sA5P918IR2Xo5ARCnRxzQGecg.JPEG.cjj642/%EC%9D%91%EC%95%A0%EA%B3%B5%EC%A3%BC.jpg?type=w966");
		cds.put("Carat","https://postfiles.pstatic.net/MjAyMjEyMDlfNjQg/MDAxNjcwNTg0MzY4MDc5.l1nQ7y63uiJ_UvfYe-m7f2gne8J8rT3FCL6Gfsh2zMsg.MUtFONrWBDbL3gkMESDZ-7lodoK7PsvKOh6xjawcV_gg.JPEG.cjj642/%EB%94%94%EC%A7%80%EC%BA%90.jpg?type=w966");
		cds.put("Pocke","https://postfiles.pstatic.net/MjAyMjExMjZfODAg/MDAxNjY5NDY3NjI0NDAz.W7J1bQBkwZYwRZ3FRHiwOzyKeHu3uPUxtYZHxU1XWbcg.BJhGVoZcQvIJNpXZ2qBLPfhdDuPb8M6fUJG11G9iGpMg.JPEG.cjj642/jj.jpg?type=w966");
		cds.put("Memento","https://postfiles.pstatic.net/MjAyMjExMTVfMTc3/MDAxNjY4NTE4MzAwMjA0.szYpkZ0lvryde6bKrinODFac8zql8rLk2k3i7FCjCAcg.5Z-5czLjgV4gQaHf6fQV4FPgZB2hVRj5N5qFggI8xkcg.JPEG.cjj642/%EB%A9%94%EB%A9%98%ED%86%A0%EB%AA%A8%EB%A6%AC.jpg?type=w966");
		cds.put("Pikachu","https://postfiles.pstatic.net/MjAyMjExMTNfMTIw/MDAxNjY4MzQ0NjE0NTIw.w25dB4-qDkx8KtahkwuR172arKIftAVKPzNjOlwP2ekg.yIUxuQCw-Sp7KpQ0PxnNX7fQ1I19CyLVIyWunBKntGQg.PNG.cjj642/%ED%94%BC%EC%B9%B4%EC%B8%84.png?type=w966");

		URL initialURL = new URL(cds.get("Gumble"));
		menuBar = new JMenuBar();
		menu = new JMenu("Favorite CDs");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);

		for (Enumeration<String> e = cds.keys(); e.hasMoreElements();) {
			String name = e.nextElement();
			JMenuItem menuItem = new JMenuItem(name);
			menu.add(menuItem); 
			menuItem.addActionListener(event -> {
				imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
				frame.repaint();
			});
		}

		// set up frame and menus

		Icon icon = new ImageProxy(initialURL);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);

	}

	URL getCDUrl(String name) {
		try {
			return new URL(cds.get(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
