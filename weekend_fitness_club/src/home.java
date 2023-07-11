
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fredy
 */
public class home extends javax.swing.JFrame {

    
     
    
    DefaultListModel defaultListModel = new DefaultListModel();
     
    
    
    
    
     int attempt = 0;
    
    
    double firstnum;
double secondnum;
double result;
String operations;
    private String[] columnData;
    
    
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        this.bindData1();//FOR CUSTOMER1
        this.bindData2(); //FOR CUSTOMER2
        this.bindData3(); //FOR CUSTOMER3
        this.bindData4(); //FOR CUSTOMER4
        this.bindData5(); //FOR CUSTOMER5
        this.bindData6(); //FOR INCOME
        
    }
    
    
    
    //THIS IS AN ARRAY LIST OF THE LESSONS BY NAME, PRICE, DATE AND MONTH
    private ArrayList getStars()
    {
        
        ArrayList stars=new ArrayList();
       stars.add("AEROBIC EXERCISE___ $10___ [APRIL_8]____[SATURDAY DAYTIME]");
         stars.add("");
         stars.add("");
       stars.add("SPIN___ $20___ [APRIL_8]____[SATURDAY EVENING]");
        stars.add("");
         stars.add("");
        stars.add("ANAEROBIC EXERCISE___ $30___ [APRIL_15]____[SATURDAY DAYTIME]");
         stars.add("");
         stars.add("");
        stars.add("YOGA___ $40___ [APRIL_15]____[SATURDAY EVENING]");
         stars.add("");
         stars.add("");
        
        stars.add("BOOT CAMPE___ $50___ [APRIL_22]____[SATURDAY DAYTIME]");
         stars.add("");
         stars.add("");
        stars.add("ZUMBA___ $60___ [APRIL_22]____[SATURDAY EVENING]");
         stars.add("");
         stars.add("");
        
        stars.add("SUPER SET___ $70___ [APRIL_29]____[SATURDAY DAYTIME]");
         stars.add("");
         stars.add("");
        stars.add("SCULPT___ $80___ [APRIL_29]____[SATURDAY EVENING]");
         stars.add("");
         stars.add("");
        
        stars.add("STRENGTH TRAINING___ $90___ [MAY_6]____[SATURDAY DAYTIME]");
         stars.add("");
         stars.add("");
        stars.add("BOX FIT___ $100___ [MAY_6]____[SATURDAY EVENING]");
         stars.add("");
         stars.add("");
        
        stars.add("RESISTANCE___ $110___ [MAY_13]____[SATURDAY DAYTIME]");
         stars.add("");
         stars.add("");
        stars.add("DEADLIFT___ $120___ [MAY_13]____[SATURDAY EVENING]");
         stars.add("");
         stars.add("");
        
        stars.add("FOAM ROLLING___ $130___ [MAY_20]____[SATURDAY DAYTIME]");
         stars.add("");
         stars.add("");
        stars.add("PULLDOWN___ $140___ [MAY_20]____[SATURDAY EVENING]");
         stars.add("");
         stars.add("");
        
        stars.add("CROSS TRAINING___ $150___ [MAY_27]____[SATURDAY DAYTIME]");
         stars.add("");
         stars.add("");
        stars.add("DUMBELL CURL___ $160___ [MAY_27]____[SATURDAY EVENING]");
         stars.add("");
         stars.add("");
         
         
         
         
        
        
        stars.add("CIRCUIT___ $170___ [APRIL_9]____[SUNDAY DAYTIME]");
         stars.add("");
         stars.add("");
        stars.add("TREADMILL___ $180___ [APRIL_9]____[SUNDAY EVENING]");
         stars.add("");
         stars.add("");
        
        
        stars.add("COMPOUND EXERCISE___ $190___ [APRIL_16]____[SUNDAY DAYTIME]");
         stars.add("");
         stars.add("");
         stars.add("JOGGING___ $200___ [APRIL_16]____[SUNDAY EVENING]");
          stars.add("");
         stars.add("");
        
        
        stars.add("DYNAMIC WARM-UP___ $210___ [APRIL_23]____[SUNDAY DAYTIME]");
         stars.add("");
         stars.add("");
        stars.add("BOXING___ $220___ [APRIL_23]____[SUNDAY EVENING]");
         stars.add("");
         stars.add("");
        
        
        stars.add("SQUATS___ $230___ [APRIL_30]____[SUNDAY DAYTIME]");
         stars.add("");
         stars.add("");
        stars.add("RUNNING___ $240___ [APRIL_30]____[SUNDAY EVENING]");
         stars.add("");
         stars.add("");
        
        
        stars.add("SIT UPS___ $250___ [MAY_7]____[SUNDAY DAYTIME]");
         stars.add("");
         stars.add("");
        stars.add("DIPS___ $260___ [MAY_7]____[SUNDAY EVENING]");
         stars.add("");
         stars.add("");
        
        
        stars.add("TRICEP DIP___ $270___ [MAY_14]____[SUNDAY DAYTIME]");
         stars.add("");
         stars.add("");
        stars.add("SHRUGS___ $280___ [MAY_14]____[SUNDAY EVENING]");
         stars.add("");
         stars.add("");
        
        
        stars.add("PULL UP___ $290___ [MAY_21]____[SUNDAY DAYTIME]");
         stars.add("");
         stars.add("");
        stars.add("PESSES___ $300___ [MAY_21]____[SUNDAY EVENING]");
         stars.add("");
         stars.add("");
        
        
        stars.add("PUSH UPS___ $310___ [MAY_28]____[SUNDAY DAYTIME]");
         stars.add("");
         stars.add("");
        stars.add("PUNCHER___ $320___ [MAY_28]____[SUNDAY EVENING]");
         stars.add("");
         stars.add("");
    
        
        return stars;   
    }
    
    
  
    
    
    
    //----------------------------------------//
    //FOR CUSTOMER1
     private void bindData1(){
        
       getStars().stream().forEach((star) -> {
       defaultListModel.addElement(star); 
       }); 
       myJList1.setModel(defaultListModel);
       myJList1.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
    }
    
    
    private void searchFilter1 (String searchTerm) 
    {
        DefaultListModel filteredItems = new DefaultListModel();
        ArrayList stars=getStars();
        
        
        stars.stream().forEach( (star)  -> {
            String starName=star.toString().toLowerCase();
            if (starName.contains(searchTerm.toLowerCase())) {
                filteredItems.addElement(star);
            }
               
        });
        defaultListModel=filteredItems;
        myJList1.setModel(defaultListModel);
    }
    
    
    
    ///////FOR CUSTOMER 2
      private void bindData2(){
        
       getStars().stream().forEach((star) -> {
       defaultListModel.addElement(star); 
       }); 
       myJList2.setModel(defaultListModel);
       myJList2.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
    }
    
    
    private void searchFilter2 (String searchTerm)
    {
        DefaultListModel filteredItems = new DefaultListModel();
        ArrayList stars=getStars();
        
        
        stars.stream().forEach( (star)  -> {
            String starName=star.toString().toLowerCase();
            if (starName.contains(searchTerm.toLowerCase())) {
                filteredItems.addElement(star);
            }
               
        });
        defaultListModel=filteredItems;
        myJList2.setModel(defaultListModel);
    }
    
    
    
    
    
    
     ///////FOR CUSTOMER 3
      private void bindData3(){
        
       getStars().stream().forEach((star) -> {
       defaultListModel.addElement(star); 
       }); 
       myJList3.setModel(defaultListModel);
       myJList3.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
    }
    
    
    private void searchFilter3 (String searchTerm)
    {
        DefaultListModel filteredItems = new DefaultListModel();
        ArrayList stars=getStars();
        
        
        stars.stream().forEach( (star)  -> {
            String starName=star.toString().toLowerCase();
            if (starName.contains(searchTerm.toLowerCase())) {
                filteredItems.addElement(star);
            }
               
        });
        defaultListModel=filteredItems;
        myJList3.setModel(defaultListModel);
    }
    
    
    
    
    
    
    
     ///////FOR CUSTOMER 4
      private void bindData4(){
        
       getStars().stream().forEach((star) -> {
       defaultListModel.addElement(star); 
       }); 
       myJList4.setModel(defaultListModel);
       myJList4.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
    }
    
    
    private void searchFilter4 (String searchTerm)
    {
        DefaultListModel filteredItems = new DefaultListModel();
        ArrayList stars=getStars();
        
        
        stars.stream().forEach( (star)  -> {
            String starName=star.toString().toLowerCase();
            if (starName.contains(searchTerm.toLowerCase())) {
                filteredItems.addElement(star);
            }
               
        });
        defaultListModel=filteredItems;
        myJList4.setModel(defaultListModel);
    }
    
    
    
    
    
     ///////FOR CUSTOMER 5
      private void bindData5(){
        
       getStars().stream().forEach((star) -> {
       defaultListModel.addElement(star); 
       }); 
       myJList5.setModel(defaultListModel);
       myJList5.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
    }
    
    
    private void searchFilter5 (String searchTerm)
    {
        DefaultListModel filteredItems = new DefaultListModel();
        ArrayList stars=getStars();
        
        
        stars.stream().forEach( (star)  -> {
            String starName=star.toString().toLowerCase();
            if (starName.contains(searchTerm.toLowerCase())) {
                filteredItems.addElement(star);
            }
               
        });
        defaultListModel=filteredItems;
        myJList5.setModel(defaultListModel);
    }
    
    
    
    ///////FOR INCOME
      private void bindData6(){
        
       getStars().stream().forEach((star) -> {
       defaultListModel.addElement(star); 
       }); 
       myJList6.setModel(defaultListModel);
       myJList6.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
    }
    
    
    private void searchFilter6 (String searchTerm)
    {
        DefaultListModel filteredItems = new DefaultListModel();
        ArrayList stars=getStars();
        
        
        stars.stream().forEach( (star)  -> {
            String starName=star.toString().toLowerCase();
            if (starName.contains(searchTerm.toLowerCase())) {
                filteredItems.addElement(star);
            }
               
        });
        defaultListModel=filteredItems;
        myJList6.setModel(defaultListModel);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jcmb_sat1 = new javax.swing.JComboBox();
        jcmb_sun1 = new javax.swing.JComboBox();
        btnclear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtsearch1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        myJList1 = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        jcmb_sat_ = new javax.swing.JComboBox();
        jcmb_sun_ = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnexit = new javax.swing.JButton();
        jcmb_rating = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jcmb_sat6 = new javax.swing.JComboBox();
        jLabel71 = new javax.swing.JLabel();
        jcmb_sun6 = new javax.swing.JComboBox();
        jcmb_age = new javax.swing.JComboBox();
        jcmb_gender = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtname1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jcmb_sat2 = new javax.swing.JComboBox();
        jcmb_sun2 = new javax.swing.JComboBox();
        btnadd1 = new javax.swing.JButton();
        btnclear1 = new javax.swing.JButton();
        btndelete1 = new javax.swing.JButton();
        btnupdate3 = new javax.swing.JButton();
        btnexit1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txtsearch2 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        myJList2 = new javax.swing.JList();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jcmb_sat_1 = new javax.swing.JComboBox();
        jcmb_sun_1 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jcmb_rating1 = new javax.swing.JComboBox();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jcmb_sat7 = new javax.swing.JComboBox();
        jcmb_sun7 = new javax.swing.JComboBox();
        jcmb_gender1 = new javax.swing.JComboBox();
        jcmb_age1 = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txtname2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jcmb_sat3 = new javax.swing.JComboBox();
        jcmb_sun3 = new javax.swing.JComboBox();
        btnadd2 = new javax.swing.JButton();
        btndeletec = new javax.swing.JButton();
        btnupdate5 = new javax.swing.JButton();
        btnexit2 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        txtsearch3 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        myJList3 = new javax.swing.JList();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jcmb_sat_2 = new javax.swing.JComboBox();
        jcmb_sun_2 = new javax.swing.JComboBox();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        jcmb_rating2 = new javax.swing.JComboBox();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jcmb_sat8 = new javax.swing.JComboBox();
        jcmb_sun8 = new javax.swing.JComboBox();
        btnclear5 = new javax.swing.JButton();
        jcmb_gender2 = new javax.swing.JComboBox();
        jcmb_age2 = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        txtname3 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        btnadd3 = new javax.swing.JButton();
        btnclear3 = new javax.swing.JButton();
        btndelete3 = new javax.swing.JButton();
        btnupdate7 = new javax.swing.JButton();
        btnexit3 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        txtsearch4 = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        myJList4 = new javax.swing.JList();
        jLabel52 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel55 = new javax.swing.JLabel();
        jcmb_rating3 = new javax.swing.JComboBox();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jcmb_sat_5 = new javax.swing.JComboBox();
        jcmb_sun_5 = new javax.swing.JComboBox();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jcmb_sat4 = new javax.swing.JComboBox();
        jcmb_sun4 = new javax.swing.JComboBox();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jcmb_sat10 = new javax.swing.JComboBox();
        jcmb_sun10 = new javax.swing.JComboBox();
        jcmb_gender3 = new javax.swing.JComboBox();
        jcmb_age3 = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        txtname4 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        btnadd4 = new javax.swing.JButton();
        btnclear4 = new javax.swing.JButton();
        btndelete4 = new javax.swing.JButton();
        btnupdate9 = new javax.swing.JButton();
        btnexit4 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        txtsearch5 = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        myJList5 = new javax.swing.JList();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel68 = new javax.swing.JLabel();
        jcmb_rating4 = new javax.swing.JComboBox();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jcmb_sat_6 = new javax.swing.JComboBox();
        jcmb_sun_6 = new javax.swing.JComboBox();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jcmb_sat5 = new javax.swing.JComboBox();
        jcmb_sun5 = new javax.swing.JComboBox();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jcmb_sat11 = new javax.swing.JComboBox();
        jcmb_sun11 = new javax.swing.JComboBox();
        jcmb_gender4 = new javax.swing.JComboBox();
        jcmb_age4 = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_rate1 = new javax.swing.JTable();
        btnrating = new javax.swing.JButton();
        btnrating1 = new javax.swing.JButton();
        btnrating5 = new javax.swing.JButton();
        btnrating6 = new javax.swing.JButton();
        btnrating7 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_income = new javax.swing.JTable();
        btnincome = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        txtsearch6 = new javax.swing.JTextField();
        jScrollPane17 = new javax.swing.JScrollPane();
        myJList6 = new javax.swing.JList();
        jPanel37 = new javax.swing.JPanel();
        jBtn8 = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jtxtDisplay = new javax.swing.JTextField();
        jBtn3 = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jButtonplus = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jButtondiv = new javax.swing.JButton();
        jButtonequals = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jButtonmin = new javax.swing.JButton();
        jBtncancel = new javax.swing.JButton();
        jButtonmult = new javax.swing.JButton();
        jBtnn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("CUSTOMER 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setText("CUSTOMER 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton3.setText("CUSTOMER 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 0, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton4.setText("CUSTOMER 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 204, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton5.setText("CUSTOMER 5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 255, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton6.setText("INCOME");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton7.setText("RATING");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 102, 102));
        jLabel15.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel15.setText("WEEKEND FITNESS");

        jLabel16.setBackground(new java.awt.Color(0, 102, 102));
        jLabel16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel16.setText("CLUB");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel15)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel16)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addGap(43, 43, 43)
                .addComponent(jButton4)
                .addGap(50, 50, 50)
                .addComponent(jButton5)
                .addGap(45, 45, 45)
                .addComponent(jButton7)
                .addGap(54, 54, 54)
                .addComponent(jButton6)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 780));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("NAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("GENDER");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("AGE");

        txtname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnameKeyTyped(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(204, 255, 255));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd.setText("ATTEND");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(204, 255, 255));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndelete.setText("CANCEL");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(204, 255, 255));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnupdate.setText("CHANGE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "GENDER", "AGE", "SATDAY", "SUNDAY", "SATEVE", "SUNEVE", "RATING"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jcmb_sat1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sat1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AEROBIC", "ANAEROBIC", "BOOT CAMPE ", "SUPER SET ", "STRENGTH", "RESISTANCE ", "ROLLING ", "CROSS TRAINING" }));
        jcmb_sat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_sat1ActionPerformed(evt);
            }
        });

        jcmb_sun1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sun1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CIRCUIT ", "COMPOUND", "WARM-UP ", "SQUATS ", "SIT UPS ", "TRICEP DIP", "PULL UP ", "PUSH UPS " }));

        btnclear.setBackground(new java.awt.Color(204, 255, 255));
        btnclear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("SELECT TWO FITNESS LESSONS BELOW");

        jLabel8.setText("SEARCH BY LESSON TYPE");

        txtsearch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtsearch1MouseReleased(evt);
            }
        });
        txtsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearch1ActionPerformed(evt);
            }
        });
        txtsearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearch1KeyReleased(evt);
            }
        });

        myJList1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        myJList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myJList1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(myJList1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("SEARCH LESSONS BY DAYS BELOW");

        jcmb_sat_.setBackground(new java.awt.Color(204, 204, 255));
        jcmb_sat_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sat_.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AEROBIC", "ANAEROBIC", "BOOT CAMPE ", "SUPER SET ", "STRENGTH  ", "RESISTANCE ", "ROLLING ", "CROSS ", "SPIN", "YOGA", "ZUMBA", "SCULPT", "BOX FIT", "DEADLIFT", "PULLDOWN", "DUMBELL CURL", " ", " " }));
        jcmb_sat_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_sat_ActionPerformed(evt);
            }
        });

        jcmb_sun_.setBackground(new java.awt.Color(204, 204, 255));
        jcmb_sun_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sun_.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CIRCUIT ", "COMPOUND", "WARM-UP ", "SQUATS ", "SIT UPS ", "TRICEP DIP", "PULL UP ", "PUSH UPS ", "TREADMILL", "JOGGING", "BOXING", "RUNNING", "DIPS", "SHRUGS", "PRESSES", "PUNCHER" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("SUNDAY");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("SATURDAY");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("SUNDAY DAY");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("SATURDAY DAY");

        btnexit.setBackground(new java.awt.Color(204, 255, 255));
        btnexit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jcmb_rating.setBackground(new java.awt.Color(204, 255, 204));
        jcmb_rating.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_rating.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1-VERY DISATISFIED", "2-DISATISFIED", "3-OK", "4-SATISFIED", "5-VERY SATISFIED" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("SELECT A RATING:");

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel70.setText("SATURDAY EVENING");

        jcmb_sat6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sat6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SPIN", "YOGA", "ZUMBA", "SCULPT", "BOX FIT", "DEADLIFT", "PULLDOWN", "DUMBELL CURL", " ", " " }));
        jcmb_sat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_sat6ActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel71.setText("SUNDAY EVENING");

        jcmb_sun6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sun6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TREADMILL", "JOGGING", "BOXING", "RUNNING", "DIPS", "SHRUGS", "PRESSES", "PUNCHER", " ", " " }));

        jcmb_age.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_age.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120" }));
        jcmb_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_ageActionPerformed(evt);
            }
        });

        jcmb_gender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE" }));
        jcmb_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_genderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnadd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnclear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnupdate))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(166, 166, 166)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcmb_age, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcmb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jcmb_sat1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcmb_sun1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(88, 88, 88))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcmb_sat6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel70)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcmb_sun6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel71)
                                        .addGap(68, 68, 68)))))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(305, 305, 305))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel11)
                                        .addGap(231, 231, 231)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jcmb_sat_, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcmb_sun_, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel9)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcmb_rating, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcmb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcmb_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcmb_sat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmb_sun1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel70)
                                    .addComponent(jLabel71))
                                .addGap(2, 2, 2)
                                .addComponent(jcmb_sat6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcmb_sun6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcmb_sat_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmb_sun_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnupdate)
                            .addComponent(btnclear)
                            .addComponent(btnadd)
                            .addComponent(btndelete)
                            .addComponent(btnexit))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmb_rating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(198, 198, 198))
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("NAME");

        txtname1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtname1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("GENDER");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("AGE");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("SELECT TWO FITNESS LESSONS BELOW");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("SATURDAY DAY");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("SUNDAY DAY");

        jcmb_sat2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sat2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AEROBIC", "ANAEROBIC", "BOOT CAMPE ", "SUPER SET ", "STRENGTH  ", "RESISTANCE ", "ROLLING ", "TRAINING" }));
        jcmb_sat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_sat2ActionPerformed(evt);
            }
        });

        jcmb_sun2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sun2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CIRCUIT ", "COMPOUND ", "WARM-UP ", "SQUATS ", "SIT UPS ", "TRICEP DIP", "PULL UP ", "PUSH UPS " }));

        btnadd1.setBackground(new java.awt.Color(204, 255, 255));
        btnadd1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd1.setText("ATTEND");
        btnadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd1ActionPerformed(evt);
            }
        });

        btnclear1.setBackground(new java.awt.Color(204, 255, 255));
        btnclear1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnclear1.setText("CLEAR");
        btnclear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclear1ActionPerformed(evt);
            }
        });

        btndelete1.setBackground(new java.awt.Color(204, 255, 255));
        btndelete1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndelete1.setText("CANCEL");
        btndelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete1ActionPerformed(evt);
            }
        });

        btnupdate3.setBackground(new java.awt.Color(204, 255, 255));
        btnupdate3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnupdate3.setText("CHANGE");
        btnupdate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate3ActionPerformed(evt);
            }
        });

        btnexit1.setBackground(new java.awt.Color(204, 255, 255));
        btnexit1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnexit1.setText("EXIT");
        btnexit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexit1ActionPerformed(evt);
            }
        });

        jLabel25.setText("SEARCH BY LESSON TYPE");

        txtsearch2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtsearch2MouseReleased(evt);
            }
        });
        txtsearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearch2ActionPerformed(evt);
            }
        });
        txtsearch2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearch2KeyReleased(evt);
            }
        });

        myJList2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        myJList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myJList2MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(myJList2);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("SEARCH LESSONS BY DAYS BELOW");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("SATURDAY");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("SUNDAY");

        jcmb_sat_1.setBackground(new java.awt.Color(204, 204, 255));
        jcmb_sat_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sat_1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AEROBIC", "ANAEROBIC", "BOOT CAMPE ", "SUPER SET ", "STRENGTH  ", "RESISTANCE ", "ROLLING ", "CROSS ", "SPIN", "YOGA", "ZUMBA", "SCULPT", "BOX FIT", "DEADLIFT", "PULLDOWN", "DUMBELL CURL" }));
        jcmb_sat_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_sat_1ActionPerformed(evt);
            }
        });

        jcmb_sun_1.setBackground(new java.awt.Color(204, 204, 255));
        jcmb_sun_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sun_1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CIRCUIT ", "COMPOUND", "WARM-UP ", "SQUATS ", "SIT UPS ", "TRICEP DIP", "PULL UP ", "PUSH UPS ", "TREADMILL", "JOGGING", "BOXING", "RUNNING", "DIPS", "SHRUGS", "PRESSES", "PUNCHER" }));

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "GENDER", "AGE", "SATURDAY", "SUNDAY", "SATEVE", "SUNEVE", "RATING"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("SELECT A RATING:");

        jcmb_rating1.setBackground(new java.awt.Color(204, 255, 204));
        jcmb_rating1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_rating1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1-VERY DISATISFIED", "2-DISATISFIED", "3-OK", "4-SATISFIED", "5-VERY SATISFIED" }));

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel72.setText("SATURDAY EVENING");

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel73.setText("SUNDAY EVENING");

        jcmb_sat7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sat7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SPIN", "YOGA", "ZUMBA", "SCULPT", "BOX FIT", "DEADLIFT", "PULLDOWN", "DUMBELL CURL", " ", " " }));
        jcmb_sat7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_sat7ActionPerformed(evt);
            }
        });

        jcmb_sun7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sun7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TREADMILL", "JOGGING", "BOXING", "RUNNING", "DIPS", "SHRUGS", "PRESSES", "PUNCHER", " ", " " }));

        jcmb_gender1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_gender1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE" }));
        jcmb_gender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_gender1ActionPerformed(evt);
            }
        });

        jcmb_age1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_age1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120" }));
        jcmb_age1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_age1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jcmb_sat2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcmb_sun2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel22))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcmb_sat7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel72)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcmb_sun7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel73)
                                .addGap(68, 68, 68))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnadd1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnclear1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelete1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnupdate3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnexit1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addGap(166, 166, 166)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcmb_age1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmb_gender1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtname1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(305, 305, 305))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel27)
                                        .addGap(231, 231, 231)
                                        .addComponent(jLabel28))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jcmb_sat_1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcmb_sun_1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel26)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcmb_rating1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(txtname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcmb_gender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcmb_age1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcmb_sat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmb_sun2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel72)
                                    .addComponent(jLabel73))
                                .addGap(2, 2, 2)
                                .addComponent(jcmb_sat7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcmb_sun7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcmb_sat_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmb_sun_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnupdate3)
                            .addComponent(btnclear1)
                            .addComponent(btnadd1)
                            .addComponent(btndelete1)
                            .addComponent(btnexit1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmb_rating1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(198, 198, 198))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("NAME");

        txtname2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtname2ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("GENDER");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("AGE");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("SELECT TWO FITNESS LESSONS BELOW");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("SATURDAY DAY");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("SUNDAY DAY");

        jcmb_sat3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sat3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AEROBIC ", "ANAEROBIC", "BOOT CAMPE ", "SUPER SET ", "STRENGTH", "RESISTANCE ", "ROLLING ", "TRAINING" }));
        jcmb_sat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_sat3ActionPerformed(evt);
            }
        });

        jcmb_sun3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sun3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CIRCUIT ", "COMPOUND", "WARM-UP ", "SQUATS ", "SIT UPS ", "TRICEP DIP", "PULL UP ", "PUSH UPS " }));

        btnadd2.setBackground(new java.awt.Color(204, 255, 255));
        btnadd2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd2.setText("ATTEND");
        btnadd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd2ActionPerformed(evt);
            }
        });

        btndeletec.setBackground(new java.awt.Color(204, 255, 255));
        btndeletec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndeletec.setText("CANCEL");
        btndeletec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletecActionPerformed(evt);
            }
        });

        btnupdate5.setBackground(new java.awt.Color(204, 255, 255));
        btnupdate5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnupdate5.setText("CHANGE");
        btnupdate5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate5ActionPerformed(evt);
            }
        });

        btnexit2.setBackground(new java.awt.Color(204, 255, 255));
        btnexit2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnexit2.setText("EXIT");
        btnexit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexit2ActionPerformed(evt);
            }
        });

        jLabel38.setText("SEARCH BY LESSON TYPE");

        txtsearch3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtsearch3MouseReleased(evt);
            }
        });
        txtsearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearch3ActionPerformed(evt);
            }
        });
        txtsearch3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearch3KeyReleased(evt);
            }
        });

        myJList3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        myJList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myJList3MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(myJList3);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("SEARCH LESSONS BY DAYS BELOW");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText("SATURDAY");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText("SUNDAY");

        jcmb_sat_2.setBackground(new java.awt.Color(204, 204, 255));
        jcmb_sat_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sat_2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AEROBIC", "ANAEROBIC", "BOOT CAMPE ", "SUPER SET ", "STRENGTH  ", "RESISTANCE ", "ROLLING ", "CROSS ", "SPIN", "YOGA", "ZUMBA", "SCULPT", "BOX FIT", "DEADLIFT", "PULLDOWN", "DUMBELL CURL" }));
        jcmb_sat_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_sat_2ActionPerformed(evt);
            }
        });

        jcmb_sun_2.setBackground(new java.awt.Color(204, 204, 255));
        jcmb_sun_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sun_2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CIRCUIT ", "COMPOUND", "WARM-UP ", "SQUATS ", "SIT UPS ", "TRICEP DIP", "PULL UP ", "PUSH UPS ", "TREADMILL", "JOGGING", "BOXING", "RUNNING", "DIPS", "SHRUGS", "PRESSES", "PUNCHER" }));

        jTable3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "GENDER", "AGE", "SATURDAY", "SUNDAY", "SATEVE", "SUNVE", "RATING"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTable3);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("SELECT A RATING:");

        jcmb_rating2.setBackground(new java.awt.Color(204, 255, 204));
        jcmb_rating2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_rating2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1-VERY DISATISFIED", "2-DISATISFIED", "3-OK", "4-SATISFIED", "5-VERY SATISFIED" }));

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel74.setText("SATURDAY EVENING");

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel75.setText("SUNDAY EVENING");

        jcmb_sat8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sat8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SPIN", "YOGA", "ZUMBA", "SCULPT", "BOX FIT", "DEADLIFT", "PULLDOWN", "DUMBELL CURL", " ", " " }));
        jcmb_sat8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_sat8ActionPerformed(evt);
            }
        });

        jcmb_sun8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sun8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TREADMILL", "JOGGING", "BOXING", "RUNNING", "DIPS", "SHRUGS", "PRESSES", "PUNCHER", " ", " " }));

        btnclear5.setBackground(new java.awt.Color(204, 255, 255));
        btnclear5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnclear5.setText("CLEAR");
        btnclear5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclear5ActionPerformed(evt);
            }
        });

        jcmb_gender2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_gender2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE" }));
        jcmb_gender2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_gender2ActionPerformed(evt);
            }
        });

        jcmb_age2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_age2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120" }));
        jcmb_age2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_age2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jcmb_sat3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcmb_sun3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel37)
                        .addGap(88, 88, 88))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcmb_sat8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel74)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcmb_sun8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel75)
                                .addGap(68, 68, 68))))
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel35))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnadd2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnclear5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnexit2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btndeletec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnupdate5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31))
                        .addGap(166, 166, 166)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcmb_age2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmb_gender2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtname2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtsearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(305, 305, 305))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel40)
                                        .addGap(231, 231, 231)
                                        .addComponent(jLabel41))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jcmb_sat_2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcmb_sun_2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel39)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcmb_rating2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(txtname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel31)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel32))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcmb_gender2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcmb_age2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcmb_sat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmb_sun3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel74)
                                    .addComponent(jLabel75))
                                .addGap(2, 2, 2)
                                .addComponent(jcmb_sat8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcmb_sun8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsearch3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcmb_sat_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmb_sun_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnupdate5)
                            .addComponent(btnadd2)
                            .addComponent(btndeletec)
                            .addComponent(btnexit2)
                            .addComponent(btnclear5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmb_rating2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(198, 198, 198))
        );

        jTabbedPane1.addTab("tab3", jPanel4);

        jPanel5.setBackground(new java.awt.Color(102, 0, 102));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("NAME");

        txtname3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtname3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtname3ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("GENDER");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setText("AGE");

        btnadd3.setBackground(new java.awt.Color(204, 255, 255));
        btnadd3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd3.setText("ATTEND");
        btnadd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd3ActionPerformed(evt);
            }
        });

        btnclear3.setBackground(new java.awt.Color(204, 255, 255));
        btnclear3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnclear3.setText("CLEAR");
        btnclear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclear3ActionPerformed(evt);
            }
        });

        btndelete3.setBackground(new java.awt.Color(204, 255, 255));
        btndelete3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndelete3.setText("CANCEL");
        btndelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete3ActionPerformed(evt);
            }
        });

        btnupdate7.setBackground(new java.awt.Color(204, 255, 255));
        btnupdate7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnupdate7.setText("CHANGE");
        btnupdate7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate7ActionPerformed(evt);
            }
        });

        btnexit3.setBackground(new java.awt.Color(204, 255, 255));
        btnexit3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnexit3.setText("EXIT");
        btnexit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexit3ActionPerformed(evt);
            }
        });

        jLabel51.setText("SEARCH BY LESSON TYPE");

        txtsearch4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtsearch4MouseReleased(evt);
            }
        });
        txtsearch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearch4ActionPerformed(evt);
            }
        });
        txtsearch4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearch4KeyReleased(evt);
            }
        });

        myJList4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        myJList4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myJList4MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(myJList4);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setText("SEARCH LESSONS BY DAYS BELOW");

        jTable4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "GENDER", "AGE", "SATURDAY", "SUNDAY", "SATEVE", "SUNEVE", "RATING"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(jTable4);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setText("SELECT A RATING:");

        jcmb_rating3.setBackground(new java.awt.Color(204, 255, 204));
        jcmb_rating3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_rating3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1-VERY DISATISFIED", "2-DISATISFIED", "3-OK", "4-SATISFIED", "5-VERY SATISFIED" }));

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel76.setText("SATURDAY");

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel77.setText("SUNDAY");

        jcmb_sat_5.setBackground(new java.awt.Color(204, 204, 255));
        jcmb_sat_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sat_5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AEROBIC", "ANAEROBIC", "BOOT CAMPE ", "SUPER SET ", "STRENGTH  ", "RESISTANCE ", "ROLLING ", "CROSS ", "SPIN", "YOGA", "ZUMBA", "SCULPT", "BOX FIT", "DEADLIFT", "PULLDOWN", "DUMBELL CURL" }));
        jcmb_sat_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_sat_5ActionPerformed(evt);
            }
        });

        jcmb_sun_5.setBackground(new java.awt.Color(204, 204, 255));
        jcmb_sun_5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sun_5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CIRCUIT ", "COMPOUND", "WARM-UP ", "SQUATS ", "SIT UPS ", "TRICEP DIP", "PULL UP ", "PUSH UPS ", "TREADMILL", "JOGGING", "BOXING", "RUNNING", "DIPS", "SHRUGS", "PRESSES", "PUNCHER" }));

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel78.setText("SELECT TWO FITNESS LESSONS BELOW");

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel79.setText("SATURDAY DAY");

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel80.setText("SUNDAY DAY");

        jcmb_sat4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sat4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AEROBIC ", "ANAEROBIC", "BOOT CAMPE ", "SUPER SET ", "STRENGTH", "RESISTANCE ", "ROLLING ", "TRAINING" }));
        jcmb_sat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_sat4ActionPerformed(evt);
            }
        });

        jcmb_sun4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sun4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CIRCUIT ", "COMPOUND", "WARM-UP ", "SQUATS ", "SIT UPS ", "TRICEP DIP", "PULL UP ", "PUSH UPS " }));

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel81.setText("SATURDAY EVENING");

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel82.setText("SUNDAY EVENING");

        jcmb_sat10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sat10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SPIN", "YOGA", "ZUMBA", "SCULPT", "BOX FIT", "DEADLIFT", "PULLDOWN", "DUMBELL CURL", " ", " " }));
        jcmb_sat10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_sat10ActionPerformed(evt);
            }
        });

        jcmb_sun10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sun10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TREADMILL", "JOGGING", "BOXING", "RUNNING", "DIPS", "SHRUGS", "PRESSES", "PUNCHER", " ", " " }));

        jcmb_gender3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_gender3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE" }));
        jcmb_gender3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_gender3ActionPerformed(evt);
            }
        });

        jcmb_age3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_age3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120" }));
        jcmb_age3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_age3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnexit3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jcmb_sat4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcmb_sun4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel80)
                        .addGap(88, 88, 88))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcmb_sat10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel81)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcmb_sun10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addGap(68, 68, 68))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(btnadd3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnclear3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndelete3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnupdate7))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel78))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel44))
                                .addGap(166, 166, 166)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcmb_age3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcmb_gender3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtname3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel52)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtsearch4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(305, 305, 305))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel76)
                                        .addGap(231, 231, 231)
                                        .addComponent(jLabel77))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jcmb_sat_5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcmb_sun_5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcmb_rating3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel43)
                            .addComponent(txtname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel44)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel45))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcmb_gender3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcmb_age3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel79)
                            .addComponent(jLabel80))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcmb_sat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmb_sun4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel81)
                                    .addComponent(jLabel82))
                                .addGap(2, 2, 2)
                                .addComponent(jcmb_sat10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcmb_sun10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsearch4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jLabel77))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmb_sat_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmb_sun_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate7)
                    .addComponent(btnclear3)
                    .addComponent(btnadd3)
                    .addComponent(btndelete3)
                    .addComponent(btnexit3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmb_rating3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addGap(198, 198, 198))
        );

        jTabbedPane1.addTab("tab4", jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setText("NAME");

        txtname4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtname4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtname4ActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel57.setText("GENDER");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setText("AGE");

        btnadd4.setBackground(new java.awt.Color(204, 255, 255));
        btnadd4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd4.setText("ATTEND");
        btnadd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd4ActionPerformed(evt);
            }
        });

        btnclear4.setBackground(new java.awt.Color(204, 255, 255));
        btnclear4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnclear4.setText("CLEAR");
        btnclear4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclear4ActionPerformed(evt);
            }
        });

        btndelete4.setBackground(new java.awt.Color(204, 255, 255));
        btndelete4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndelete4.setText("CANCEL");
        btndelete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete4ActionPerformed(evt);
            }
        });

        btnupdate9.setBackground(new java.awt.Color(204, 255, 255));
        btnupdate9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnupdate9.setText("CHANGE");
        btnupdate9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate9ActionPerformed(evt);
            }
        });

        btnexit4.setBackground(new java.awt.Color(204, 255, 255));
        btnexit4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnexit4.setText("EXIT");
        btnexit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexit4ActionPerformed(evt);
            }
        });

        jLabel64.setText("SEARCH BY LESSON TYPE");

        txtsearch5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtsearch5MouseReleased(evt);
            }
        });
        txtsearch5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearch5ActionPerformed(evt);
            }
        });
        txtsearch5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearch5KeyReleased(evt);
            }
        });

        myJList5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        myJList5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myJList5MouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(myJList5);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setText("SEARCH LESSONS BY DAYS BELOW");

        jTable5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "GENDER", "AGE", "SATURDAY", "SUNDAY", "SATEVE", "SUNEVE", "RATING"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(jTable5);

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel68.setText("SELECT A RATING:");

        jcmb_rating4.setBackground(new java.awt.Color(204, 255, 204));
        jcmb_rating4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_rating4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1-VERY DISATISFIED", "2-DISATISFIED", "3-OK", "4-SATISFIED", "5-VERY SATISFIED" }));

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel83.setText("SATURDAY");

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel84.setText("SUNDAY");

        jcmb_sat_6.setBackground(new java.awt.Color(204, 204, 255));
        jcmb_sat_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sat_6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AEROBIC", "ANAEROBIC", "BOOT CAMPE ", "SUPER SET ", "STRENGTH  ", "RESISTANCE ", "ROLLING ", "CROSS ", "SPIN", "YOGA", "ZUMBA", "SCULPT", "BOX FIT", "DEADLIFT", "PULLDOWN", "DUMBELL CURL" }));
        jcmb_sat_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_sat_6ActionPerformed(evt);
            }
        });

        jcmb_sun_6.setBackground(new java.awt.Color(204, 204, 255));
        jcmb_sun_6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sun_6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CIRCUIT ", "COMPOUND", "WARM-UP ", "SQUATS ", "SIT UPS ", "TRICEP DIP", "PULL UP ", "PUSH UPS ", "TREADMILL", "JOGGING", "BOXING", "RUNNING", "DIPS", "SHRUGS", "PRESSES", "PUNCHER" }));

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel85.setText("SELECT TWO FITNESS LESSONS BELOW");

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel86.setText("SATURDAY DAY");

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel87.setText("SUNDAY DAY");

        jcmb_sat5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sat5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AEROBIC ", "ANAEROBIC", "BOOT CAMPE ", "SUPER SET ", "STRENGTH", "RESISTANCE ", "ROLLING ", "TRAINING" }));
        jcmb_sat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_sat5ActionPerformed(evt);
            }
        });

        jcmb_sun5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sun5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CIRCUIT ", "COMPOUND", "WARM-UP ", "SQUATS ", "SIT UPS ", "TRICEP DIP", "PULL UP ", "PUSH UPS " }));

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel88.setText("SATURDAY EVENING");

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel89.setText("SUNDAY EVENING");

        jcmb_sat11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sat11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SPIN", "YOGA", "ZUMBA", "SCULPT", "BOX FIT", "DEADLIFT", "PULLDOWN", "DUMBELL CURL", " ", " " }));
        jcmb_sat11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_sat11ActionPerformed(evt);
            }
        });

        jcmb_sun11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_sun11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TREADMILL", "JOGGING", "BOXING", "RUNNING", "DIPS", "SHRUGS", "PRESSES", "PUNCHER", " ", " " }));

        jcmb_gender4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_gender4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE" }));
        jcmb_gender4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_gender4ActionPerformed(evt);
            }
        });

        jcmb_age4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmb_age4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120" }));
        jcmb_age4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb_age4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(btnadd4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnclear4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndelete4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnupdate9))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel57))
                                .addGap(166, 166, 166)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtname4, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcmb_age4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcmb_gender4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnexit4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jcmb_sat5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcmb_sun5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel86)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel87)
                                .addGap(88, 88, 88))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcmb_sat11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel88)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcmb_sun11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel89)
                                        .addGap(68, 68, 68))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel85)))))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel65)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtsearch5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(305, 305, 305))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel83)
                                        .addGap(231, 231, 231)
                                        .addComponent(jLabel84))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jcmb_sat_6, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcmb_sun_6, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcmb_rating4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel56)
                            .addComponent(txtname4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel57)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel58))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcmb_gender4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcmb_age4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(jLabel87))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcmb_sat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmb_sun5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel88)
                                    .addComponent(jLabel89))
                                .addGap(2, 2, 2)
                                .addComponent(jcmb_sat11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcmb_sun11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsearch5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jLabel84))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmb_sat_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmb_sun_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate9)
                    .addComponent(btnclear4)
                    .addComponent(btnadd4)
                    .addComponent(btndelete4)
                    .addComponent(btnexit4))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmb_rating4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68))
                .addGap(198, 198, 198))
        );

        jTabbedPane1.addTab("tab5", jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jTable_rate1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable_rate1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "GENDER", "AGE", "SATDAY", "SUNDAY", "SATEVE", "SUNEVE", "RATING"
            }
        ));
        jTable_rate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_rate1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable_rate1);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnrating.setBackground(new java.awt.Color(255, 51, 51));
        btnrating.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnrating.setText("CUSTOMER 1 RECORDS");
        btnrating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnratingActionPerformed(evt);
            }
        });

        btnrating1.setBackground(new java.awt.Color(255, 51, 51));
        btnrating1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnrating1.setText("CUSTOMER 2 RECORDS");
        btnrating1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrating1ActionPerformed(evt);
            }
        });

        btnrating5.setBackground(new java.awt.Color(255, 51, 51));
        btnrating5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnrating5.setText("CUSTOMER 3 RECORDS");
        btnrating5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrating5ActionPerformed(evt);
            }
        });

        btnrating6.setBackground(new java.awt.Color(255, 51, 51));
        btnrating6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnrating6.setText("CUSTOMER 4 RECORDS");
        btnrating6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrating6ActionPerformed(evt);
            }
        });

        btnrating7.setBackground(new java.awt.Color(255, 51, 51));
        btnrating7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnrating7.setText("CUSTOMER 5 RECORDS");
        btnrating7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrating7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnrating, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnrating1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnrating5, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnrating6, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnrating7, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrating)
                    .addComponent(btnrating1)
                    .addComponent(btnrating5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrating6)
                    .addComponent(btnrating7))
                .addContainerGap(347, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", jPanel7);

        jPanel8.setBackground(new java.awt.Color(102, 255, 102));

        jTable_income.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable_income.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "SATURDAY DAY", "SUNDAY DAY", "SATURDAY EVENING", "SUNDAY EVENING"
            }
        ));
        jTable_income.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_incomeMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable_income);

        btnincome.setBackground(new java.awt.Color(255, 51, 51));
        btnincome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnincome.setText("VIEW INCOME ");
        btnincome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnincomeActionPerformed(evt);
            }
        });

        jLabel69.setText("SEARCH FOR LESSON PRICE");

        txtsearch6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtsearch6MouseReleased(evt);
            }
        });
        txtsearch6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearch6ActionPerformed(evt);
            }
        });
        txtsearch6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearch6KeyReleased(evt);
            }
        });

        myJList6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        myJList6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myJList6MouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(myJList6);

        jPanel37.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CALCULATOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N

        jBtn8.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jtxtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jBtn3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtn0.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jButtonplus.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButtonplus.setText("+");
        jButtonplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonplusActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jButtondiv.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButtondiv.setText("/");
        jButtondiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondivActionPerformed(evt);
            }
        });

        jButtonequals.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButtonequals.setText("=");
        jButtonequals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonequalsActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jButtonmin.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButtonmin.setText("-");
        jButtonmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonminActionPerformed(evt);
            }
        });

        jBtncancel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jBtncancel.setText("C");
        jBtncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtncancelActionPerformed(evt);
            }
        });

        jButtonmult.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButtonmult.setText("X");
        jButtonmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmultActionPerformed(evt);
            }
        });

        jBtnn.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jBtnn.setText(".");
        jBtnn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtDisplay)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBtn0)
                                    .addComponent(jBtn7)
                                    .addComponent(jBtn3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn8)))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(jBtn4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtn5)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn9)
                            .addComponent(jBtn6)
                            .addComponent(jBtn2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtondiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBtncancel))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel37Layout.createSequentialGroup()
                                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonplus)
                                            .addComponent(jButtonequals))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBtnn))
                                    .addGroup(jPanel37Layout.createSequentialGroup()
                                        .addComponent(jButtonmin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addComponent(jButtonmult)))))))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn0)
                    .addComponent(jButtondiv)
                    .addComponent(jBtn1)
                    .addComponent(jBtn9))
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(jBtncancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonmult)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                                .addComponent(jButtonplus)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonequals, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn7)
                            .addComponent(jBtn8)
                            .addComponent(jBtn6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn4)
                            .addComponent(jBtn5)
                            .addComponent(jBtn2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn3)
                        .addGap(142, 142, 142))))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtsearch6, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnincome, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsearch6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnincome)
                .addGap(192, 192, 192))
        );

        jTabbedPane1.addTab("tab7", jPanel8);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, -33, 1320, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      //Get jtable model first
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
       
       
       
       String tblName = tblModel.getValueAt (jTable1.getSelectedRow(), 0).toString();
       String tblGender = tblModel.getValueAt (jTable1.getSelectedRow(), 0).toString();
       String tblAge = tblModel.getValueAt (jTable1.getSelectedRow(), 0).toString();
       String tblSaturday = tblModel.getValueAt (jTable1.getSelectedRow(), 0).toString();
       String tblSunday = tblModel.getValueAt (jTable1.getSelectedRow(), 0).toString();
       
       
       
       
       txtname.setText(tblName);
       jcmb_gender.setSelectedItem(tblName);
       jcmb_age.setSelectedItem(tblName);
     
       
      
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
     //Get jtable model first
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
       
      //Deletes row
      if (jTable1.getSelectedRowCount() == 1) {
          //If single row is selected then delete
          tblModel.removeRow(jTable1.getSelectedRow());
          
      }else {
          if (jTable1.getRowCount () == 0) {
              //If tabe1 is empty (no data) then display message
              JOptionPane.showMessageDialog(this, "Table is Empty.");
          }else {
              //If table is not empty but row is not selected or multiple row is selected
               JOptionPane.showMessageDialog(this, "Please select singl row for deletion.");
          }
      }
      
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
         //Get jtable model first
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
       
        if (jTable1.getSelectedRowCount() == 1){
            //if single row is selected then update
            
            String name = txtname.getText();
            String gender = (String) jcmb_gender.getSelectedItem();
            String age = (String) jcmb_age.getSelectedItem();
            String satday = (String) jcmb_sat1.getSelectedItem();
            String sunday = (String) jcmb_sun1.getSelectedItem();
            String sateve = (String) jcmb_sat6.getSelectedItem(); 
            String suneve = (String) jcmb_sun6.getSelectedItem(); 
            String rating = (String) jcmb_rating.getSelectedItem(); 
                    
            
           
            
            
            
            
            
            //Set updated value on table row
            tblModel.setValueAt (name, jTable1.getSelectedRow(), 0);
            tblModel.setValueAt (gender, jTable1.getSelectedRow(), 1);
            tblModel.setValueAt (age, jTable1.getSelectedRow(), 2);
           tblModel.setValueAt (satday, jTable1.getSelectedRow(), 3);
            tblModel.setValueAt (sunday, jTable1.getSelectedRow(), 4);
             tblModel.setValueAt (sateve, jTable1.getSelectedRow(), 5);
              tblModel.setValueAt (suneve, jTable1.getSelectedRow(), 6);
               tblModel.setValueAt (rating, jTable1.getSelectedRow(), 7);
        
        
        
        //Update message display
             JOptionPane.showMessageDialog(this, "Update successful.");
         
        
        }else{
            if(jTable1.getRowCount()==0){
                //If table is empty
              JOptionPane.showMessageDialog(this, "Table is empty.");
           
            }else{
                //If no row is selected or multiple row is selected
                JOptionPane.showMessageDialog(this, "Please select a single row to be updated.");
             
            }
        }
        
        
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       
        
        if (txtname.getText().equals("")|| jcmb_gender.getSelectedItem().equals("")|| jcmb_age.getSelectedItem().equals("") || jcmb_sat1.getSelectedItem().equals("") || jcmb_sun1.getSelectedItem().equals("") || jcmb_sat6.getSelectedItem().equals("") || jcmb_sun6.getSelectedItem().equals("") ||  jcmb_rating.getSelectedItem().equals("")   ){
        
       JOptionPane.showMessageDialog(this, "Please enter all data");
       
    }else{
    
    //If all data fields are complete then store data into string array

String data[] = {txtname.getText(),(String) jcmb_gender.getSelectedItem(),(String) jcmb_age.getSelectedItem(), (String) jcmb_sat1.getSelectedItem(), (String) jcmb_sun1.getSelectedItem(), (String) jcmb_sat6.getSelectedItem(), (String) jcmb_sun6.getSelectedItem(), (String) jcmb_rating.getSelectedItem() };



DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

//Clear the target table before copying data
tblModel.setRowCount(0);

//Add string array data
tblModel.addRow(data); //Row added

//Successfully added message
JOptionPane.showMessageDialog(this, "CONGRATULATIONS");

//Clear textfield for new data to be entered
txtname.setText(null);
jcmb_gender.setSelectedItem(null);
jcmb_age.setSelectedItem(null);

jcmb_rating.setSelectedItem(null);
       
            
        
        
        
        }   
    }//GEN-LAST:event_btnaddActionPerformed

    private void jcmb_sat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_sat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_sat1ActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
       txtname.setText("");
       jcmb_gender.setSelectedItem("");
       jcmb_age.setSelectedItem("");
      
      
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtsearch1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearch1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch1MouseReleased

    private void txtsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch1ActionPerformed

    private void txtsearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearch1KeyReleased
        searchFilter1(txtsearch1.getText());
    }//GEN-LAST:event_txtsearch1KeyReleased

    private void myJList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myJList1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_myJList1MouseClicked

    private void jcmb_sat_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_sat_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_sat_ActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnratingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnratingActionPerformed
//
////Assuming that table1 is the source table and table2 is the target table
//
//DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
//DefaultTableModel model2 = (DefaultTableModel) jTable_rate1.getModel();
//
////Get the number of rows and columns in the source table
//int rowCount = model1.getRowCount();
//int columnCount = model1.getColumnCount();
//
////Clear the target table before copying data
////model2.setRowCount(0);
//
////Copy each cell from source table to target table
//for(int i = 0; i < rowCount; i++){
//    Object[] row = new Object[columnCount];
//    for(int j = 0; j < columnCount; j++){
//        row[j] = model1.getValueAt(i, j);
//    }
//    model2.addRow(row);
//}
        
        
        
        
        
        DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
DefaultTableModel model2 = (DefaultTableModel) jTable_rate1.getModel();

//Get the number of rows and columns in the source table
int rowCount = model1.getRowCount();
int columnCount = model1.getColumnCount();

//Clear the target table before copying data
//model2.setRowCount(0);

//Copy only the specified data from source table to target table
for(int i = 0; i < rowCount; i++){
    Object[] row = new Object[8];
    row[0] = model1.getValueAt(i, 0); 
    row[1] = model1.getValueAt(i, 1);
    row[2] = model1.getValueAt(i, 2); 
    row[3] = model1.getValueAt(i, 3); 
    row[4] = model1.getValueAt(i, 4); 
    row[5] = model1.getValueAt(i, 5); 
    row[6] = model1.getValueAt(i, 6); 
    row[7] = model1.getValueAt(i, 7); 
    model2.addRow(row);
}
    
    }//GEN-LAST:event_btnratingActionPerformed

    private void txtname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtname1ActionPerformed

    private void jcmb_sat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_sat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_sat2ActionPerformed

    private void btnadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd1ActionPerformed
          
        if (txtname1.getText().equals("")|| jcmb_gender1.getSelectedItem().equals("")|| jcmb_age1.getSelectedItem().equals("") || jcmb_sat2.getSelectedItem().equals("") || jcmb_sun2.getSelectedItem().equals("") || jcmb_sat7.getSelectedItem().equals("") || jcmb_sun7.getSelectedItem().equals("") ||  jcmb_rating1.getSelectedItem().equals("")   ){
        
       JOptionPane.showMessageDialog(this, "Please enter all data");
       
    }else{
    
    //If all data fields are complete then store data into string array

String data[] = {txtname1.getText(),(String) jcmb_gender1.getSelectedItem(),(String) jcmb_age1.getSelectedItem(), (String) jcmb_sat2.getSelectedItem(), (String) jcmb_sun2.getSelectedItem(), (String) jcmb_sat7.getSelectedItem(), (String) jcmb_sun7.getSelectedItem(), (String) jcmb_rating1.getSelectedItem() };



DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();

//Clear the target table before copying data
tblModel.setRowCount(0);

//Add string array data
tblModel.addRow(data); //Row added

//Successfully added message
JOptionPane.showMessageDialog(this, "CONGRATULATIONS");

//Clear textfield for new data to be entered
txtname1.setText(null);
jcmb_gender1.setSelectedItem(null);
jcmb_age1.setSelectedItem(null);

jcmb_rating1.setSelectedItem(null);
       
            
        
        
        
        }   
    }//GEN-LAST:event_btnadd1ActionPerformed

    private void btnclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclear1ActionPerformed
        txtname1.setText("");
       jcmb_gender1.setSelectedItem("");
       jcmb_age1.setSelectedItem("");
       
    }//GEN-LAST:event_btnclear1ActionPerformed

    private void btndelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete1ActionPerformed
         //Get jtable model first
        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
       
      //Deletes row
      if (jTable2.getSelectedRowCount() == 1) {
          //If single row is selected then delete
          tblModel.removeRow(jTable2.getSelectedRow());
          
      }else {
          if (jTable2.getRowCount () == 0) {
              //If tabe1 is empty (no data) then display message
              JOptionPane.showMessageDialog(this, "Table is Empty.");
          }else {
              //If table is not empty but row is not selected or multiple row is selected
               JOptionPane.showMessageDialog(this, "Please select singl row for deletion.");
          }
      }
    }//GEN-LAST:event_btndelete1ActionPerformed

    private void btnupdate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate3ActionPerformed
         //Get jtable model first
        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
       
        if (jTable2.getSelectedRowCount() == 1){
            //if single row is selected then update
            
            String name = txtname.getText();
            String gender = (String) jcmb_gender1.getSelectedItem();
            String age = (String) jcmb_age1.getSelectedItem();
            String satday = (String) jcmb_sat2.getSelectedItem();
            String sunday = (String) jcmb_sun2.getSelectedItem();
            String sateve = (String) jcmb_sat7.getSelectedItem(); 
            String suneve = (String) jcmb_sun7.getSelectedItem(); 
            String rating = (String) jcmb_rating.getSelectedItem(); 
                    
            
           
            
            
            
            
            
            //Set updated value on table row
            tblModel.setValueAt (name, jTable2.getSelectedRow(), 0);
            tblModel.setValueAt (gender, jTable2.getSelectedRow(), 1);
            tblModel.setValueAt (age, jTable2.getSelectedRow(), 2);
           tblModel.setValueAt (satday, jTable2.getSelectedRow(), 3);
            tblModel.setValueAt (sunday, jTable2.getSelectedRow(), 4);
             tblModel.setValueAt (sateve, jTable2.getSelectedRow(), 5);
              tblModel.setValueAt (suneve, jTable2.getSelectedRow(), 6);
               tblModel.setValueAt (rating, jTable2.getSelectedRow(), 7);
        
        
        
        //Update message display
             JOptionPane.showMessageDialog(this, "Update successful.");
         
        
        }else{
            if(jTable2.getRowCount()==0){
                //If table is empty
              JOptionPane.showMessageDialog(this, "Table is empty.");
           
            }else{
                //If no row is selected or multiple row is selected
                JOptionPane.showMessageDialog(this, "Please select a single row to be updated.");
             
            }
        }
    }//GEN-LAST:event_btnupdate3ActionPerformed

    private void btnexit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexit1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexit1ActionPerformed

    private void txtsearch2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearch2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch2MouseReleased

    private void txtsearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch2ActionPerformed

    private void txtsearch2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearch2KeyReleased
        searchFilter2(txtsearch2.getText());
    }//GEN-LAST:event_txtsearch2KeyReleased

    private void myJList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myJList2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_myJList2MouseClicked

    private void jcmb_sat_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_sat_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_sat_1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void btnrating1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrating1ActionPerformed
        
 DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
DefaultTableModel model2 = (DefaultTableModel) jTable_rate1.getModel();

//Get the number of rows and columns in the source table
int rowCount = model1.getRowCount();
int columnCount = model1.getColumnCount();

//Clear the target table before copying data
//model2.setRowCount(0);

//Copy only the specified data from source table to target table
for(int i = 0; i < rowCount; i++){
    Object[] row = new Object[8];
    row[0] = model1.getValueAt(i, 0); 
    row[1] = model1.getValueAt(i, 1);
    row[2] = model1.getValueAt(i, 2); 
    row[3] = model1.getValueAt(i, 3); 
    row[4] = model1.getValueAt(i, 4); 
    row[5] = model1.getValueAt(i, 5); 
    row[6] = model1.getValueAt(i, 6); 
    row[7] = model1.getValueAt(i, 7); 
    model2.addRow(row);
}
    
    }//GEN-LAST:event_btnrating1ActionPerformed

    private void txtname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtname2ActionPerformed

    private void jcmb_sat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_sat3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_sat3ActionPerformed

    private void btnadd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd2ActionPerformed

        if (txtname2.getText().equals("")|| jcmb_gender2.getSelectedItem().equals("")|| jcmb_age2.getSelectedItem().equals("") || jcmb_sat3.getSelectedItem().equals("") || jcmb_sun3.getSelectedItem().equals("") || jcmb_sat8.getSelectedItem().equals("") || jcmb_sun8.getSelectedItem().equals("") ||  jcmb_rating2.getSelectedItem().equals("")   ){
        
       JOptionPane.showMessageDialog(this, "Please enter all data");
       
    }else{
    
    //If all data fields are complete then store data into string array

String data[] = {txtname2.getText(),(String) jcmb_gender2.getSelectedItem(),(String) jcmb_age2.getSelectedItem(), (String) jcmb_sat3.getSelectedItem(), (String) jcmb_sun3.getSelectedItem(), (String) jcmb_sat8.getSelectedItem(), (String) jcmb_sun8.getSelectedItem(), (String) jcmb_rating2.getSelectedItem() };



DefaultTableModel tblModel = (DefaultTableModel) jTable3.getModel();

//Clear the target table before copying data
tblModel.setRowCount(0);

//Add string array data
tblModel.addRow(data); //Row added

//Successfully added message
JOptionPane.showMessageDialog(this, "CONGRATULATIONS");

//Clear textfield for new data to be entered
txtname2.setText(null);
jcmb_gender2.setSelectedItem(null);
jcmb_age2.setSelectedItem(null);

jcmb_rating2.setSelectedItem(null);
        }
       
             }//GEN-LAST:event_btnadd2ActionPerformed

    private void btndeletecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletecActionPerformed
       
 //Get jtable model first
        DefaultTableModel tblModel = (DefaultTableModel) jTable3.getModel();
       
      //Deletes row
      if (jTable3.getSelectedRowCount() == 1) {
          //If single row is selected then delete
          tblModel.removeRow(jTable3.getSelectedRow());
          
      }else {
          if (jTable3.getRowCount () == 0) {
              //If tabe1 is empty (no data) then display message
              JOptionPane.showMessageDialog(this, "Table is Empty.");
          }else {
              //If table is not empty but row is not selected or multiple row is selected
               JOptionPane.showMessageDialog(this, "Please select singl row for deletion.");
          }
      }




    }//GEN-LAST:event_btndeletecActionPerformed

    private void btnupdate5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate5ActionPerformed
       
 //Get jtable model first
       
 DefaultTableModel tblModel = (DefaultTableModel) jTable3.getModel();
       
        if (jTable3.getSelectedRowCount() == 1){
            //if single row is selected then update
            
            String name = txtname2.getText();
            String gender = (String) jcmb_gender2.getSelectedItem();
            String age = (String) jcmb_age2.getSelectedItem();
            String satday = (String) jcmb_sat3.getSelectedItem();
            String sunday = (String) jcmb_sun3.getSelectedItem();
            String sateve = (String) jcmb_sat8.getSelectedItem(); 
            String suneve = (String) jcmb_sun8.getSelectedItem(); 
            String rating = (String) jcmb_rating2.getSelectedItem(); 
                    
            
           
            
            
            
            
            
            //Set updated value on table row
            tblModel.setValueAt (name, jTable3.getSelectedRow(), 0);
            tblModel.setValueAt (gender, jTable3.getSelectedRow(), 1);
            tblModel.setValueAt (age, jTable3.getSelectedRow(), 2);
           tblModel.setValueAt (satday, jTable3.getSelectedRow(), 3);
            tblModel.setValueAt (sunday, jTable3.getSelectedRow(), 4);
             tblModel.setValueAt (sateve, jTable3.getSelectedRow(), 5);
              tblModel.setValueAt (suneve, jTable3.getSelectedRow(), 6);
               tblModel.setValueAt (rating, jTable3.getSelectedRow(), 7);
        
        
        
        //Update message display
             JOptionPane.showMessageDialog(this, "Update successful.");
         
        
        }else{
            if(jTable3.getRowCount()==0){
                //If table is empty
              JOptionPane.showMessageDialog(this, "Table is empty.");
           
            }else{
                //If no row is selected or multiple row is selected
                JOptionPane.showMessageDialog(this, "Please select a single row to be updated.");
             
            }
        }
        
    }//GEN-LAST:event_btnupdate5ActionPerformed

    private void btnexit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexit2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnexit2ActionPerformed

    private void txtsearch3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearch3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch3MouseReleased

    private void txtsearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearch3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch3ActionPerformed

    private void txtsearch3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearch3KeyReleased
       searchFilter3(txtsearch3.getText());
    }//GEN-LAST:event_txtsearch3KeyReleased

    private void myJList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myJList3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_myJList3MouseClicked

    private void jcmb_sat_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_sat_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_sat_2ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked

    private void txtname3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtname3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtname3ActionPerformed

    private void btnadd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd3ActionPerformed

        if (txtname3.getText().equals("")|| jcmb_gender3.getSelectedItem().equals("")|| jcmb_age3.getSelectedItem().equals("") || jcmb_sat4.getSelectedItem().equals("") || jcmb_sun4.getSelectedItem().equals("") || jcmb_sat10.getSelectedItem().equals("") || jcmb_sun10.getSelectedItem().equals("") ||  jcmb_rating3.getSelectedItem().equals("")   ){
        
       JOptionPane.showMessageDialog(this, "Please enter all data");
       
    }else{
    
    //If all data fields are complete then store data into string array

String data[] = {txtname3.getText(),(String) jcmb_gender3.getSelectedItem(),(String) jcmb_age3.getSelectedItem(), (String) jcmb_sat4.getSelectedItem(), (String) jcmb_sun4.getSelectedItem(), (String) jcmb_sat10.getSelectedItem(), (String) jcmb_sun10.getSelectedItem(), (String) jcmb_rating3.getSelectedItem() };



DefaultTableModel tblModel = (DefaultTableModel) jTable4.getModel();

//Clear the target table before copying data
tblModel.setRowCount(0);

//Add string array data
tblModel.addRow(data); //Row added

//Successfully added message
JOptionPane.showMessageDialog(this, "CONGRATULATIONS");

//Clear textfield for new data to be entered
txtname3.setText(null);
jcmb_gender3.setSelectedItem(null);
jcmb_age3.setSelectedItem(null);

jcmb_rating3.setSelectedItem(null);
       
            
  }
       }//GEN-LAST:event_btnadd3ActionPerformed

    private void btnclear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclear3ActionPerformed
         txtname3.setText("");
       jcmb_gender3.setSelectedItem("");
       jcmb_age3.setSelectedItem("");
       
    }//GEN-LAST:event_btnclear3ActionPerformed

    private void btndelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete3ActionPerformed
       
 //Get jtable model first
        DefaultTableModel tblModel = (DefaultTableModel) jTable4.getModel();
       
      //Deletes row
      if (jTable4.getSelectedRowCount() == 1) {
          //If single row is selected then delete
          tblModel.removeRow(jTable4.getSelectedRow());
          
      }else {
          if (jTable4.getRowCount () == 0) {
              //If tabe1 is empty (no data) then display message
              JOptionPane.showMessageDialog(this, "Table is Empty.");
          }else {
              //If table is not empty but row is not selected or multiple row is selected
               JOptionPane.showMessageDialog(this, "Please select singl row for deletion.");
          }
      }


    }//GEN-LAST:event_btndelete3ActionPerformed

    private void btnupdate7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate7ActionPerformed
         //Get jtable model first
        DefaultTableModel tblModel = (DefaultTableModel) jTable4.getModel();
       
        if (jTable4.getSelectedRowCount() == 1){
            //if single row is selected then update
            
            String name = txtname3.getText();
            String gender = (String) jcmb_gender3.getSelectedItem();
            String age = (String) jcmb_age3.getSelectedItem();
            String satday = (String) jcmb_sat4.getSelectedItem();
            String sunday = (String) jcmb_sun4.getSelectedItem();
            String sateve = (String) jcmb_sat10.getSelectedItem(); 
            String suneve = (String) jcmb_sun10.getSelectedItem(); 
            String rating = (String) jcmb_rating3.getSelectedItem(); 
                    
            
           
            
            
            
            
            
            //Set updated value on table row
            tblModel.setValueAt (name, jTable4.getSelectedRow(), 0);
            tblModel.setValueAt (gender, jTable4.getSelectedRow(), 1);
            tblModel.setValueAt (age, jTable4.getSelectedRow(), 2);
           tblModel.setValueAt (satday, jTable4.getSelectedRow(), 3);
            tblModel.setValueAt (sunday, jTable4.getSelectedRow(), 4);
             tblModel.setValueAt (sateve, jTable4.getSelectedRow(), 5);
              tblModel.setValueAt (suneve, jTable4.getSelectedRow(), 6);
               tblModel.setValueAt (rating, jTable4.getSelectedRow(), 7);
        
        
        
        //Update message display
             JOptionPane.showMessageDialog(this, "Update successful.");
         
        
        }else{
            if(jTable4.getRowCount()==0){
                //If table is empty
              JOptionPane.showMessageDialog(this, "Table is empty.");
           
            }else{
                //If no row is selected or multiple row is selected
                JOptionPane.showMessageDialog(this, "Please select a single row to be updated.");
             
            }
        }
        
    }//GEN-LAST:event_btnupdate7ActionPerformed

    private void btnexit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexit3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexit3ActionPerformed

    private void txtsearch4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearch4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch4MouseReleased

    private void txtsearch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearch4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch4ActionPerformed

    private void txtsearch4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearch4KeyReleased
        searchFilter4(txtsearch4.getText());
    }//GEN-LAST:event_txtsearch4KeyReleased

    private void myJList4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myJList4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_myJList4MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseClicked

    private void txtname4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtname4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtname4ActionPerformed

    private void btnadd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd4ActionPerformed
      
 
        if (txtname4.getText().equals("")|| jcmb_gender4.getSelectedItem().equals("")|| jcmb_age4.getSelectedItem().equals("") || jcmb_sat5.getSelectedItem().equals("") || jcmb_sun5.getSelectedItem().equals("") || jcmb_sat11.getSelectedItem().equals("") || jcmb_sun11.getSelectedItem().equals("") ||  jcmb_rating4.getSelectedItem().equals("")   ){
        
       JOptionPane.showMessageDialog(this, "Please enter all data");
       
    }else{
    
    //If all data fields are complete then store data into string array

String data[] = {txtname4.getText(),(String) jcmb_gender4.getSelectedItem(),(String) jcmb_age4.getSelectedItem(), (String) jcmb_sat5.getSelectedItem(), (String) jcmb_sun5.getSelectedItem(), (String) jcmb_sat11.getSelectedItem(), (String) jcmb_sun11.getSelectedItem(), (String) jcmb_rating4.getSelectedItem() };



DefaultTableModel tblModel = (DefaultTableModel) jTable5.getModel();


//Add string array data
tblModel.addRow(data); //Row added

//Successfully added message
JOptionPane.showMessageDialog(this, "Data successfully added");

//Clear textfield for new data to be entered
txtname4.setText(null);
jcmb_gender4.setSelectedItem(null);
jcmb_age4.setSelectedItem(null);
jcmb_rating4.setSelectedItem(null);
       
            
         
        
        }  
    }//GEN-LAST:event_btnadd4ActionPerformed

    private void btnclear4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclear4ActionPerformed
        txtname4.setText("");
       jcmb_gender4.setSelectedItem("");
       jcmb_age4.setSelectedItem("");
      
    }//GEN-LAST:event_btnclear4ActionPerformed

    private void btndelete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete4ActionPerformed
     
 //Get jtable model first
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
       
      //Deletes row
      if (jTable5.getSelectedRowCount() == 1) {
          //If single row is selected then delete
          tblModel.removeRow(jTable5.getSelectedRow());
          
      }else {
          if (jTable5.getRowCount () == 0) {
              //If tabe1 is empty (no data) then display message
              JOptionPane.showMessageDialog(this, "Table is Empty.");
          }else {
              //If table is not empty but row is not selected or multiple row is selected
               JOptionPane.showMessageDialog(this, "Please select singl row for deletion.");
          }
      }
    }//GEN-LAST:event_btndelete4ActionPerformed

    private void btnupdate9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate9ActionPerformed
       //Get jtable model first
        DefaultTableModel tblModel = (DefaultTableModel) jTable5.getModel();
       
        if (jTable5.getSelectedRowCount() == 1){
            //if single row is selected then update
            
            String name = txtname4.getText();
            String gender = (String) jcmb_gender4.getSelectedItem();
            String age = (String) jcmb_age4.getSelectedItem();
            String satday = (String) jcmb_sat5.getSelectedItem();
            String sunday = (String) jcmb_sun5.getSelectedItem();
            String sateve = (String) jcmb_sat11.getSelectedItem(); 
            String suneve = (String) jcmb_sun11.getSelectedItem(); 
            String rating = (String) jcmb_rating4.getSelectedItem(); 
                    
            
           
            
            
            
            
            
            //Set updated value on table row
            tblModel.setValueAt (name, jTable5.getSelectedRow(), 0);
            tblModel.setValueAt (gender, jTable1.getSelectedRow(), 1);
            tblModel.setValueAt (age, jTable5.getSelectedRow(), 2);
           tblModel.setValueAt (satday, jTable5.getSelectedRow(), 3);
            tblModel.setValueAt (sunday, jTable5.getSelectedRow(), 4);
             tblModel.setValueAt (sateve, jTable5.getSelectedRow(), 5);
              tblModel.setValueAt (suneve, jTable5.getSelectedRow(), 6);
               tblModel.setValueAt (rating, jTable5.getSelectedRow(), 7);
        
        
        
        //Update message display
             JOptionPane.showMessageDialog(this, "Update successful.");
         
        
        }else{
            if(jTable5.getRowCount()==0){
                //If table is empty
              JOptionPane.showMessageDialog(this, "Table is empty.");
           
            }else{
                //If no row is selected or multiple row is selected
                JOptionPane.showMessageDialog(this, "Please select a single row to be updated.");
             
            }
        }
        
    }//GEN-LAST:event_btnupdate9ActionPerformed

    private void btnexit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexit4ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnexit4ActionPerformed

    private void txtsearch5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearch5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch5MouseReleased

    private void txtsearch5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearch5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch5ActionPerformed

    private void txtsearch5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearch5KeyReleased
       searchFilter5(txtsearch5.getText());
    }//GEN-LAST:event_txtsearch5KeyReleased

    private void myJList5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myJList5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_myJList5MouseClicked

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable5MouseClicked

    private void jTable_rate1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_rate1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_rate1MouseClicked

    private void jTable_incomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_incomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_incomeMouseClicked

    private void btnincomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnincomeActionPerformed
        //Assuming that table1 is the source table and table2 is the target table

DefaultTableModel model1 = (DefaultTableModel) jTable_rate1.getModel();
DefaultTableModel model2 = (DefaultTableModel) jTable_income.getModel();

//Get the number of rows and columns in the source table
int rowCount = model1.getRowCount();
int columnCount = model1.getColumnCount();

//Clear the target table before copying data
model2.setRowCount(0);

//Copy only the specified data from source table to target table
for(int i = 0; i < rowCount; i++){
    Object[] row = new Object[5];
    row[0] = model1.getValueAt(i, 0); 
    row[1] = model1.getValueAt(i, 3);
    row[2] = model1.getValueAt(i, 4); 
    row[3] = model1.getValueAt(i, 5); 
    row[4] = model1.getValueAt(i, 6); 
    model2.addRow(row);
}

    }//GEN-LAST:event_btnincomeActionPerformed

    private void txtsearch6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearch6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch6MouseReleased

    private void txtsearch6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearch6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch6ActionPerformed

    private void txtsearch6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearch6KeyReleased
       searchFilter6(txtsearch6.getText());
    }//GEN-LAST:event_txtsearch6KeyReleased

    private void myJList6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myJList6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_myJList6MouseClicked

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn8.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn1.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn9.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn4.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn3.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn0.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jButtonplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonplusActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "+";
    }//GEN-LAST:event_jButtonplusActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn5.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn6.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn7.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jButtondivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondivActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "/";
    }//GEN-LAST:event_jButtondivActionPerformed

    private void jButtonequalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonequalsActionPerformed
        String answer;
        secondnum = Double.parseDouble(jtxtDisplay.getText());
        if (operations == "+")
        {
            result = firstnum + secondnum;
            answer = String.format("%.0f",result);
            jtxtDisplay.setText(answer);
        }

        else if (operations == "-")
        {
            result = firstnum - secondnum;
            answer = String.format("%.0f",result);
            jtxtDisplay.setText(answer);
        }

        else if (operations == "*")
        {
            result = firstnum * secondnum;
            answer = String.format("%.0f",result);
            jtxtDisplay.setText(answer);
        }

        else if (operations == "/")
        {
            result = firstnum / secondnum;
            answer = String.format("%.0f",result);
            jtxtDisplay.setText(answer);
        }
    }//GEN-LAST:event_jButtonequalsActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtn2.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jButtonminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonminActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "-";
    }//GEN-LAST:event_jButtonminActionPerformed

    private void jBtncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtncancelActionPerformed
        jtxtDisplay.setText("");
    }//GEN-LAST:event_jBtncancelActionPerformed

    private void jButtonmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmultActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "*";
    }//GEN-LAST:event_jButtonmultActionPerformed

    private void jBtnnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnnActionPerformed
        String Enternumber = jtxtDisplay.getText() + jBtnn.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtnnActionPerformed

    private void jcmb_sat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_sat6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_sat6ActionPerformed

    private void jcmb_sat7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_sat7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_sat7ActionPerformed

    private void btnrating5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrating5ActionPerformed
       DefaultTableModel model1 = (DefaultTableModel) jTable3.getModel();
DefaultTableModel model2 = (DefaultTableModel) jTable_rate1.getModel();

//Get the number of rows and columns in the source table
int rowCount = model1.getRowCount();
int columnCount = model1.getColumnCount();

//Clear the target table before copying data
//model2.setRowCount(0);

//Copy only the specified data from source table to target table
for(int i = 0; i < rowCount; i++){
    Object[] row = new Object[8];
    row[0] = model1.getValueAt(i, 0); 
    row[1] = model1.getValueAt(i, 1);
    row[2] = model1.getValueAt(i, 2); 
    row[3] = model1.getValueAt(i, 3); 
    row[4] = model1.getValueAt(i, 4); 
    row[5] = model1.getValueAt(i, 5); 
    row[6] = model1.getValueAt(i, 6); 
    row[7] = model1.getValueAt(i, 7); 
    model2.addRow(row);
}
    }//GEN-LAST:event_btnrating5ActionPerformed

    private void btnrating6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrating6ActionPerformed
      DefaultTableModel model1 = (DefaultTableModel) jTable4.getModel();
DefaultTableModel model2 = (DefaultTableModel) jTable_rate1.getModel();

//Get the number of rows and columns in the source table
int rowCount = model1.getRowCount();
int columnCount = model1.getColumnCount();

//Clear the target table before copying data
//model2.setRowCount(0);

//Copy only the specified data from source table to target table
for(int i = 0; i < rowCount; i++){
    Object[] row = new Object[8];
    row[0] = model1.getValueAt(i, 0); 
    row[1] = model1.getValueAt(i, 1);
    row[2] = model1.getValueAt(i, 2); 
    row[3] = model1.getValueAt(i, 3); 
    row[4] = model1.getValueAt(i, 4); 
    row[5] = model1.getValueAt(i, 5); 
    row[6] = model1.getValueAt(i, 6); 
    row[7] = model1.getValueAt(i, 7); 
    model2.addRow(row);
}
    }//GEN-LAST:event_btnrating6ActionPerformed

    private void btnrating7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrating7ActionPerformed
      DefaultTableModel model1 = (DefaultTableModel) jTable5.getModel();
DefaultTableModel model2 = (DefaultTableModel) jTable_rate1.getModel();

//Get the number of rows and columns in the source table
int rowCount = model1.getRowCount();
int columnCount = model1.getColumnCount();

//Clear the target table before copying data
//model2.setRowCount(0);

//Copy only the specified data from source table to target table
for(int i = 0; i < rowCount; i++){
    Object[] row = new Object[8];
    row[0] = model1.getValueAt(i, 0); 
    row[1] = model1.getValueAt(i, 1);
    row[2] = model1.getValueAt(i, 2); 
    row[3] = model1.getValueAt(i, 3); 
    row[4] = model1.getValueAt(i, 4); 
    row[5] = model1.getValueAt(i, 5); 
    row[6] = model1.getValueAt(i, 6); 
    row[7] = model1.getValueAt(i, 7); 
    model2.addRow(row);
}
    }//GEN-LAST:event_btnrating7ActionPerformed

    private void jcmb_sat8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_sat8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_sat8ActionPerformed

    private void btnclear5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclear5ActionPerformed
          txtname2.setText("");
       jcmb_gender2.setSelectedItem("");
      jcmb_age2.setSelectedItem("");
    }//GEN-LAST:event_btnclear5ActionPerformed

    private void jcmb_sat_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_sat_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_sat_5ActionPerformed

    private void jcmb_sat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_sat4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_sat4ActionPerformed

    private void jcmb_sat10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_sat10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_sat10ActionPerformed

    private void jcmb_sat_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_sat_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_sat_6ActionPerformed

    private void jcmb_sat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_sat5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_sat5ActionPerformed

    private void jcmb_sat11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_sat11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_sat11ActionPerformed

    private void jcmb_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_ageActionPerformed

    private void jcmb_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_genderActionPerformed

    private void jcmb_gender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_gender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_gender1ActionPerformed

    private void jcmb_age1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_age1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_age1ActionPerformed

    private void jcmb_gender2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_gender2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_gender2ActionPerformed

    private void jcmb_age2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_age2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_age2ActionPerformed

    private void jcmb_gender3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_gender3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_gender3ActionPerformed

    private void jcmb_age3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_age3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_age3ActionPerformed

    private void jcmb_gender4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_gender4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_gender4ActionPerformed

    private void jcmb_age4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb_age4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb_age4ActionPerformed

    private void txtnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameKeyPressed

    private void txtnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnadd1;
    private javax.swing.JButton btnadd2;
    private javax.swing.JButton btnadd3;
    private javax.swing.JButton btnadd4;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclear1;
    private javax.swing.JButton btnclear3;
    private javax.swing.JButton btnclear4;
    private javax.swing.JButton btnclear5;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btndelete1;
    private javax.swing.JButton btndelete3;
    private javax.swing.JButton btndelete4;
    private javax.swing.JButton btndeletec;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnexit1;
    private javax.swing.JButton btnexit2;
    private javax.swing.JButton btnexit3;
    private javax.swing.JButton btnexit4;
    private javax.swing.JButton btnincome;
    private javax.swing.JButton btnrating;
    private javax.swing.JButton btnrating1;
    private javax.swing.JButton btnrating5;
    private javax.swing.JButton btnrating6;
    private javax.swing.JButton btnrating7;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnupdate3;
    private javax.swing.JButton btnupdate5;
    private javax.swing.JButton btnupdate7;
    private javax.swing.JButton btnupdate9;
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtncancel;
    private javax.swing.JButton jBtnn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtondiv;
    private javax.swing.JButton jButtonequals;
    private javax.swing.JButton jButtonmin;
    private javax.swing.JButton jButtonmult;
    private javax.swing.JButton jButtonplus;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable_income;
    private javax.swing.JTable jTable_rate1;
    private javax.swing.JComboBox jcmb_age;
    private javax.swing.JComboBox jcmb_age1;
    private javax.swing.JComboBox jcmb_age2;
    private javax.swing.JComboBox jcmb_age3;
    private javax.swing.JComboBox jcmb_age4;
    private javax.swing.JComboBox jcmb_gender;
    private javax.swing.JComboBox jcmb_gender1;
    private javax.swing.JComboBox jcmb_gender2;
    private javax.swing.JComboBox jcmb_gender3;
    private javax.swing.JComboBox jcmb_gender4;
    private javax.swing.JComboBox jcmb_rating;
    private javax.swing.JComboBox jcmb_rating1;
    private javax.swing.JComboBox jcmb_rating2;
    private javax.swing.JComboBox jcmb_rating3;
    private javax.swing.JComboBox jcmb_rating4;
    private javax.swing.JComboBox jcmb_sat1;
    private javax.swing.JComboBox jcmb_sat10;
    private javax.swing.JComboBox jcmb_sat11;
    private javax.swing.JComboBox jcmb_sat2;
    private javax.swing.JComboBox jcmb_sat3;
    private javax.swing.JComboBox jcmb_sat4;
    private javax.swing.JComboBox jcmb_sat5;
    private javax.swing.JComboBox jcmb_sat6;
    private javax.swing.JComboBox jcmb_sat7;
    private javax.swing.JComboBox jcmb_sat8;
    private javax.swing.JComboBox jcmb_sat_;
    private javax.swing.JComboBox jcmb_sat_1;
    private javax.swing.JComboBox jcmb_sat_2;
    private javax.swing.JComboBox jcmb_sat_5;
    private javax.swing.JComboBox jcmb_sat_6;
    private javax.swing.JComboBox jcmb_sun1;
    private javax.swing.JComboBox jcmb_sun10;
    private javax.swing.JComboBox jcmb_sun11;
    private javax.swing.JComboBox jcmb_sun2;
    private javax.swing.JComboBox jcmb_sun3;
    private javax.swing.JComboBox jcmb_sun4;
    private javax.swing.JComboBox jcmb_sun5;
    private javax.swing.JComboBox jcmb_sun6;
    private javax.swing.JComboBox jcmb_sun7;
    private javax.swing.JComboBox jcmb_sun8;
    private javax.swing.JComboBox jcmb_sun_;
    private javax.swing.JComboBox jcmb_sun_1;
    private javax.swing.JComboBox jcmb_sun_2;
    private javax.swing.JComboBox jcmb_sun_5;
    private javax.swing.JComboBox jcmb_sun_6;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JList myJList1;
    private javax.swing.JList myJList2;
    private javax.swing.JList myJList3;
    private javax.swing.JList myJList4;
    private javax.swing.JList myJList5;
    private javax.swing.JList myJList6;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtname1;
    private javax.swing.JTextField txtname2;
    private javax.swing.JTextField txtname3;
    private javax.swing.JTextField txtname4;
    private javax.swing.JTextField txtsearch1;
    private javax.swing.JTextField txtsearch2;
    private javax.swing.JTextField txtsearch3;
    private javax.swing.JTextField txtsearch4;
    private javax.swing.JTextField txtsearch5;
    private javax.swing.JTextField txtsearch6;
    // End of variables declaration//GEN-END:variables

    
}
