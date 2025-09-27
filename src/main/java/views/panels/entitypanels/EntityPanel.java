package views.panels.entitypanels;

import views.frames.MainFrame;
import views.panels.SidebarPanel;
import views.styles.Button;
import views.styles.CustomTable;
import views.styles.Style;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class EntityPanel extends JPanel {
    protected MainFrame owner;
    protected JPanel mainPanel;
    protected JPanel eastPanel;
    protected JPanel tablePanel;
    protected SidebarPanel sideBarPanel;
    protected CustomTable table;
    protected DefaultTableModel model;
    protected Button backBtn;

    public EntityPanel(MainFrame owner) {
        setOpaque(false);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.owner = owner;
        this.mainPanel = new JPanel();
        this.mainPanel.setOpaque(false);
        this.mainPanel.setLayout(new BoxLayout(this.mainPanel, BoxLayout.X_AXIS));
        this.tablePanel = new JPanel();
        this.tablePanel.setOpaque(false);
        this.tablePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 40));
        this.tablePanel.setPreferredSize(new Dimension(650, owner.getHeight()));
        this.tablePanel.setBorder(BorderFactory.createEmptyBorder(0, -20, 0, 0));
        this.eastPanel = new JPanel();
        this.eastPanel.setOpaque(false);
        this.eastPanel.setLayout(new BoxLayout(this.eastPanel, BoxLayout.Y_AXIS));
        this.eastPanel.setPreferredSize(new Dimension(280, owner.getHeight()));
        this.backBtn = new Button("←", 50, 35, 15, 25, Color.WHITE, Style.COLOR_BTN_BACK, Style.COLOR_BTN_BACK_HOVER);

        //ActionListeners


    }

    public void addComponents() {
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Figure 1
        g2d.setColor(Style.COLOR_BACKGROUND);
        g2d.fillRoundRect(sideBarPanel.getX(), sideBarPanel.getY()+20, sideBarPanel.getWidth(), 60, 20, 20);


    }

}
