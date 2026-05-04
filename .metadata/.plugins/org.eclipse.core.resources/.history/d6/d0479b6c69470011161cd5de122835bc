package q29;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class HospitalSystem extends JFrame implements ActionListener {

    JMenuBar mb;
    JMenu home, doctor, patient;
    JMenuItem about, services, exit1;
    JMenuItem docInfo, docReg;
    JMenuItem patDetails, billing, exit2;

    Connection con;

    HospitalSystem() {

        setTitle("Hospital Management System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospital?useSSL=false&serverTimezone=UTC",
                "root",
                ""   // XAMPP default
            );
            System.out.println("DB Connected");
        } catch (Exception e) {
            e.printStackTrace();
        }

   
        mb = new JMenuBar();

        home = new JMenu("Home");
        doctor = new JMenu("Doctor");
        patient = new JMenu("Patient");

 
        about = new JMenuItem("About Us");
        services = new JMenuItem("Services");
        exit1 = new JMenuItem("Exit");

        home.add(about);
        home.add(services);
        home.addSeparator();
        home.add(exit1);

        // Doctor
        docInfo = new JMenuItem("Doctor Info");
        docReg = new JMenuItem("Doctor Registration");

        doctor.add(docInfo);
        doctor.add(docReg);


        patDetails = new JMenuItem("Patient Details");
        billing = new JMenuItem("Billing");
        exit2 = new JMenuItem("Exit");

        patient.add(patDetails);
        patient.add(billing);
        patient.addSeparator();
        patient.add(exit2);

        mb.add(home);
        mb.add(doctor);
        mb.add(patient);

        setJMenuBar(mb);


        about.addActionListener(this);
        services.addActionListener(this);
        exit1.addActionListener(this);
        docInfo.addActionListener(this);
        docReg.addActionListener(this);
        patDetails.addActionListener(this);
        billing.addActionListener(this);
        exit2.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {

            if (e.getSource() == about) {
                JOptionPane.showMessageDialog(this, "Hospital Management System");
            }

            else if (e.getSource() == services) {
                JOptionPane.showMessageDialog(this, "Services: OPD, ICU, Emergency");
            }

            // DOCTOR REGISTRATION (INSERT)
            else if (e.getSource() == docReg) {

                String id = JOptionPane.showInputDialog("Enter Doctor ID:");
                String name = JOptionPane.showInputDialog("Enter Name:");
                String spec = JOptionPane.showInputDialog("Enter Specialization:");

                PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO doctor VALUES(?,?,?)");

                ps.setInt(1, Integer.parseInt(id));
                ps.setString(2, name);
                ps.setString(3, spec);

                ps.executeUpdate();

                JOptionPane.showMessageDialog(this, "Doctor Registered");
            }

          
            else if (e.getSource() == docInfo) {

                ResultSet rs = con.createStatement()
                        .executeQuery("SELECT * FROM doctor");

                String data = "";
                while (rs.next()) {
                    data += rs.getInt(1) + " "
                          + rs.getString(2) + " "
                          + rs.getString(3) + "\n";
                }

                JOptionPane.showMessageDialog(this, data);
            }

         
            else if (e.getSource() == patDetails) {

                String id = JOptionPane.showInputDialog("Enter Patient ID:");
                String name = JOptionPane.showInputDialog("Enter Name:");
                String disease = JOptionPane.showInputDialog("Enter Disease:");

                PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO patient(id,name,disease) VALUES(?,?,?)");

                ps.setInt(1, Integer.parseInt(id));
                ps.setString(2, name);
                ps.setString(3, disease);

                ps.executeUpdate();

                JOptionPane.showMessageDialog(this, "Patient Added");
            }

            // BILLING (UPDATE)
            else if (e.getSource() == billing) {

                String id = JOptionPane.showInputDialog("Enter Patient ID:");
                String bill = JOptionPane.showInputDialog("Enter Bill Amount:");

                PreparedStatement ps = con.prepareStatement(
                        "UPDATE patient SET bill=? WHERE id=?");

                ps.setDouble(1, Double.parseDouble(bill));
                ps.setInt(2, Integer.parseInt(id));

                ps.executeUpdate();

                JOptionPane.showMessageDialog(this, "Bill Updated");
            }

      
            else if (e.getSource() == exit1 || e.getSource() == exit2) {
                System.exit(0);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new HospitalSystem();
    }
}
