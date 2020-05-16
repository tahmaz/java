package luget;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.*;
import com.borland.dx.sql.dataset.Database;
import com.borland.dx.sql.dataset.QueryDataSet;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import com.borland.dx.sql.dataset.*;
import com.borland.dbswing.JdbTable;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import com.borland.dbswing.JdbTextArea;
import com.borland.dbswing.TableScrollPane;
import com.borland.dx.dataset.DataSetView;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2009</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class Frame1 extends JFrame {
    JPanel contentPane;
    BorderLayout borderLayout1 = new BorderLayout();
    JTabbedPane jTabbedPane1 = new JTabbedPane();
    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    Database database1 = new Database();
    QueryDataSet queryDataSet1 = new QueryDataSet();
    Border border1 = BorderFactory.createLineBorder(Color.white, 2);
    JdbTextArea jdbTextArea1 = new JdbTextArea();
    JdbTable jdbTable1 = new JdbTable();
    TableScrollPane tableScrollPane1 = new TableScrollPane();
    DataSetView dataSetView1 = new DataSetView();
    public Frame1() {
        try {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            jbInit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /**
     * Component initialization.
     *
     * @throws java.lang.Exception
     */
    private void jbInit() throws Exception {
        contentPane = (JPanel) getContentPane();
        contentPane.setLayout(borderLayout1);
        setSize(new Dimension(400, 300));
        setTitle("Frame Title");
        jPanel1.setLayout(null);
        jPanel2.setLayout(null);
        database1.setConnection(new ConnectionDescriptor(
                "jdbc:borland:dslocal:E:\\My_programs\\Luget\\Luget.jds",
                "tehmaz", "", false,
                "com.borland.datastore.jdbc.DataStoreDriver"));
        database1.setDatabaseName("");
        queryDataSet1.setQuery(new com.borland.dx.sql.dataset.QueryDescriptor(
                database1, "SELECT * FROM LUGET", null, true, Load.ALL));
        jdbTextArea1.setText("jdbTextArea1");
        jdbTextArea1.setColumnName("TRANSLATE");
        jdbTextArea1.setDataSet(queryDataSet1);
        jdbTextArea1.setBounds(new Rectangle(192, 10, 190, 208));
        jdbTable1.setToolTipText("");
        jdbTable1.setDataSet(queryDataSet1);
        tableScrollPane1.setBounds(new Rectangle(8, 8, 178, 217));
        dataSetView1.setSort(new com.borland.dx.dataset.SortDescriptor("",
                new String[] {"WORD"}, new boolean[] {false, }, null, 0));
        dataSetView1.setStorageDataSet(queryDataSet1);
        contentPane.add(jTabbedPane1, java.awt.BorderLayout.CENTER);
        jTabbedPane1.add(jPanel1, "jPanel1");
        jPanel1.add(jdbTextArea1);
        jPanel1.add(tableScrollPane1);
        tableScrollPane1.getViewport().add(jdbTable1);
        jTabbedPane1.add(jPanel2, "jPanel2");
    }
}
