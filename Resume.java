package org.jsp.resumedemo;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
class Resume extends JFrame implements ActionListener {

    JTextField nameText, genderText, fathernameText, cityText,
            emaillText, skillsText, collegeText, degreeText, linkedlnText,
            githubText, hackerankText, contactText, experienceText;
    JPasswordField password, cpassword;
    // panel
    JFrame p = new JFrame("Created By Kamlesh Prasad Yadav- Online Resume Builder");
    JComboBox<String> cb;
    // constructor
    Resume() {
        super("Resume");
        p.getContentPane().setBackground(Color.orange);
        // create textfield
        String[] optionsToChoose = {"Male", "Female"};
        cb = new JComboBox<>(optionsToChoose);
        cb.setBounds(200, 60, 200, 30);
        p.add(cb);

        nameText = new JTextField(3);
        fathernameText = new JTextField(3);
        password = new JPasswordField(3);
        cpassword = new JPasswordField(3);
        cityText = new JTextField(3);
        emaillText = new JTextField(3);
        skillsText = new JTextField(3);
        collegeText = new JTextField(3);
        degreeText = new JTextField(3);
        linkedlnText = new JTextField(3);
        githubText = new JTextField(3);
        hackerankText = new JTextField(3);
        contactText = new JTextField(3);
        experienceText = new JTextField(3);

        nameText.setBounds(200, 10, 200, 30);
        fathernameText.setBounds(200, 110, 200, 30);
        password.setBounds(200, 160, 200, 30);
        cpassword.setBounds(200, 210, 200, 30);
        cityText.setBounds(200, 260, 200, 30);
        emaillText.setBounds(200, 310, 200, 30);
        skillsText.setBounds(200, 360, 200, 30);

        collegeText.setBounds(700, 10, 200, 30);
        degreeText.setBounds(700, 60, 200, 30);
        experienceText.setBounds(700, 110, 200, 30);

        linkedlnText.setBounds(200, 510, 200, 30);
        githubText.setBounds(200, 560, 200, 30);
        hackerankText.setBounds(200, 610, 200, 30);
        contactText.setBounds(200, 660, 200, 30);

        p.add(nameText);
        p.add(fathernameText);
        p.add(password);
        p.add(cpassword);
        p.add(cityText);
        p.add(emaillText);
        p.add(skillsText);
        p.add(collegeText);
        p.add(degreeText);
        p.add(linkedlnText);
        p.add(githubText);
        p.add(hackerankText);
        p.add(contactText);
        p.add(experienceText);

        // create labels
        JLabel nameJLabel = new JLabel("NAME");
        JLabel genderJLabel = new JLabel("GENDER");
        JLabel fathernameJLabel = new JLabel("FATHERNAME");
        JLabel passwordJLabel = new JLabel("PASSWORD");
        JLabel cpasswordJLabel = new JLabel("CONFIRM PASSWORD");
        JLabel cityJLabel = new JLabel("CITY");
        JLabel emailJLabel = new JLabel("Email");
        JLabel emailJLabe = new JLabel("");
        JLabel skilJLabel = new JLabel("Skills");
        JLabel collegeJLabel = new JLabel("College");
        JLabel degreeJLabel = new JLabel("Degree");
        JLabel linkedlnJLabel = new JLabel("Linkedin link");
        JLabel githubJLabel = new JLabel("Github link");
        JLabel hackerJLabel = new JLabel("HackerRank link");
        JLabel contactJLabel = new JLabel("Contact");
        JLabel experienceLabel = new JLabel("Experience");
        // set location
        nameJLabel.setBounds(10, 10, 150, 30);
        genderJLabel.setBounds(10, 60, 150, 30);
        fathernameJLabel.setBounds(10, 110, 150, 30);
        passwordJLabel.setBounds(10, 160, 150, 30);
        cpasswordJLabel.setBounds(10, 210, 150, 30);
        cityJLabel.setBounds(10, 260, 150, 30);
        emailJLabel.setBounds(10, 310, 150, 30);
        emailJLabe.setBounds(10, 310, 150, 30);
        skilJLabel.setBounds(10, 360, 150, 30);

        linkedlnJLabel.setBounds(10, 510, 150, 30);
        githubJLabel.setBounds(10, 560, 150, 30);
        hackerJLabel.setBounds(10, 610, 150, 30);
        contactJLabel.setBounds(10, 660, 150, 30);

        experienceLabel.setBounds(500, 110, 150, 30);
        collegeJLabel.setBounds(500, 10, 150, 30);
        degreeJLabel.setBounds(500, 60, 150, 30);

        p.add(nameJLabel);
        p.add(genderJLabel);
        p.add(fathernameJLabel);
        p.add(passwordJLabel);
        p.add(cpasswordJLabel);
        p.add(cityJLabel);
        p.add(emailJLabel);
        p.add(emailJLabe);
        p.add(skilJLabel);
        p.add(collegeJLabel);
        p.add(degreeJLabel);
        p.add(hackerJLabel);
        p.add(linkedlnJLabel);
        p.add(githubJLabel);
        p.add(contactJLabel);
        p.add(experienceLabel);

        // create button
        JButton b = new JButton("REGISTER");
        JButton b1 = new JButton("RESET");
        b.setBounds(500, 400, 100, 30);
        b1.setBounds(700, 400, 100, 30);
        // add ActionListener
        p.add(b);
        p.add(b1);
        b.addActionListener(this);
        b1.addActionListener(this);

        // setSize(800, 800);
        // add(p);
        p.setLayout(null);
        p.setVisible(true);
        p.setSize(1000, 1000);
    }

    // if button is pressed
    public void actionPerformed(ActionEvent evt) {
        String s = evt.getActionCommand();
        String password1 = new String(password.getPassword());
        String password2 = new String(cpassword.getPassword());
        String name = nameText.getText();
        String fathername = fathernameText.getText();
        String city = cityText.getText();
        String email = emaillText.getText();
        String gender = (String) cb.getSelectedItem();
        String uskills = skillsText.getText();
        String ucollege = collegeText.getText();
        String udegree = degreeText.getText();
        String ulinkdln = linkedlnText.getText();
        String ugithub = githubText.getText();
        String ucontact = contactText.getText();
        String uexperience = experienceText.getText();

        if (s.equals("REGISTER")) {
            JFrame f;
            if (name.equals("") || fathername.equals("") || city.equals("") ||
                    email.equals("") || gender.equals("") || password1.equals("") ||
                    password2.equals("") || ucollege.equals("") || udegree.equals("") ||
                    ucontact.equals("") || ulinkdln.equals("") || ugithub.equals("") || uexperience.equals("")) {
                f = new JFrame();
                JOptionPane.showMessageDialog(f, "Enter all details");
            } else if (password1.equals(password2)) {
                f = new JFrame();
                JOptionPane.showMessageDialog(f, "Data Registered Successfully");
                try {
                    FileOutputStream filee = new FileOutputStream(name + "_Resume.pdf", true);
                    String in = "Name: " + name + "\nGender: " + gender + "\nFather name: " + fathername + "\nPassword: " + password1 + "\nCity: " + city + "\nEmail: " + email +
                            "\nSkills: " + uskills + "\nCollege: " + ucollege + "\nDegree: " + udegree + "\nLinkedin: " + ulinkdln + "\nGithub: " + ugithub + "\nContact: " + ucontact +
                            "\nExperience: " + uexperience;
                    char ch[] = in.toCharArray();
                    for (int i = 0; i < in.length(); i++) {
                        filee.write(ch[i]);
                    }
                    filee.close();
                } catch (Exception e) {
                }
            } else {
                f = new JFrame();
                JOptionPane.showMessageDialog(f, "Password did not match");
            }
        } else if (s.equals("RESET")) {
            nameText.setText("");
            fathernameText.setText("");
            password.setText("");
            cpassword.setText("");
            emaillText.setText("");
            cityText.setText("");
            skillsText.setText("");
            linkedlnText.setText("");
            experienceText.setText("");
            degreeText.setText("");
            githubText.setText("");
            contactText.setText("");
        }
    }

    // Main Method
    public static void main(String args[]) {
        Resume r = new Resume();
    }
}
