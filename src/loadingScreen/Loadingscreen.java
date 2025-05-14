package loadingScreen;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.*;
import java.awt.*;
import java.io.File;

/** Simple loading screen for Minecraft-like game **/

public class Loadingscreen extends JFrame {
    // UI components
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField worldNameField;
    private JCheckBox adminAccessBox;
    private JPanel adminPanel;

    // Audio clip for background music
    private Clip backgroundMusic;

    // Background image path (800x600px JPG recommended)
    private final String BACKGROUND_IMAGE = "res/background.jpg";

    // Background music path (WAV format)
    private final String BACKGROUND_MUSIC = "res/background.wav";

    /**
     * Constructor
     */
    public Loadingscreen() {
        // Setup window
        setTitle("Minecraft Clone");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Create main panel with background
        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Try to load background image
                try {
                    Image background = new ImageIcon(BACKGROUND_IMAGE).getImage();
                    g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
                } catch (Exception e) {
                    // Fallback background if image fails to load
                    g.setColor(new Color(60, 60, 60));
                    g.fillRect(0, 0, getWidth(), getHeight());

                    // Simple title text
                    g.setColor(Color.WHITE);
                    g.setFont(new Font("Arial", Font.BOLD, 24));
                    g.drawString("MINECRAFT CLONE", 300, 100);
                }
            }
        };
        mainPanel.setLayout(null);

        // Create login panel
        createLoginPanel(mainPanel);

        // Play background music
        playBackgroundMusic();

        // Add panel and show window
        add(mainPanel);
        setVisible(true);
    }

    /**
     * Create login components
     */
    private void createLoginPanel(JPanel parent) {
        // Create semi-transparent panel
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setBounds(250, 150, 300, 300);
        loginPanel.setBackground(new Color(0, 0, 0, 180));

        // Username field
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(20, 30, 100, 25);
        usernameLabel.setForeground(Color.WHITE);
        loginPanel.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(120, 30, 160, 25);
        loginPanel.add(usernameField);

        // Password field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 70, 100, 25);
        passwordLabel.setForeground(Color.WHITE);
        loginPanel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(120, 70, 160, 25);
        loginPanel.add(passwordField);

        // World name field
        JLabel worldLabel = new JLabel("World Name:");
        worldLabel.setBounds(20, 110, 100, 25);
        worldLabel.setForeground(Color.WHITE);
        loginPanel.add(worldLabel);

        worldNameField = new JTextField();
        worldNameField.setBounds(120, 110, 160, 25);
        loginPanel.add(worldNameField);

        // Admin checkbox
        adminAccessBox = new JCheckBox("Admin Access");
        adminAccessBox.setBounds(20, 150, 120, 25);
        adminAccessBox.setForeground(Color.WHITE);
        adminAccessBox.setBackground(new Color(0, 0, 0, 0));
        adminAccessBox.addActionListener(e -> toggleAdminPanel());
        loginPanel.add(adminAccessBox);

        // Admin panel (hidden by default)
        createAdminPanel(loginPanel);

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(20, 250, 120, 30);
        loginButton.addActionListener(e -> login());
        loginPanel.add(loginButton);

        // Register button
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(160, 250, 120, 30);
        registerButton.addActionListener(e -> register());
        loginPanel.add(registerButton);

        parent.add(loginPanel);
    }

    /**
     * Create simple admin panel
     */
    private void createAdminPanel(JPanel parent) {
        adminPanel = new JPanel();
        adminPanel.setLayout(new GridLayout(2, 2, 5, 5));
        adminPanel.setBounds(20, 180, 260, 60);
        adminPanel.setBackground(new Color(40, 40, 40));
        adminPanel.setVisible(false);

        // Admin options
        adminPanel.add(new JCheckBox("God Mode"));
        adminPanel.add(new JCheckBox("Fly Mode"));
        adminPanel.add(new JCheckBox("Item Spawning"));
        adminPanel.add(new JCheckBox("Weather Control"));

        // Style checkboxes
        for (Component c : adminPanel.getComponents()) {
            if (c instanceof JCheckBox) {
                JCheckBox cb = (JCheckBox) c;
                cb.setForeground(Color.WHITE);
                cb.setBackground(new Color(40, 40, 40));
            }
        }

        parent.add(adminPanel);
    }

    /**
     * Toggle admin panel visibility
     */
    private void toggleAdminPanel() {
        adminPanel.setVisible(adminAccessBox.isSelected());
    }

    /**
     * Process login
     */
    private void login() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String worldName = worldNameField.getText();

        // Simple validation
        if (username.isEmpty() || password.isEmpty() || worldName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // For demo purposes, allow any login
        JOptionPane.showMessageDialog(this, "Login successful! Starting game...", "Success", JOptionPane.INFORMATION_MESSAGE);
        startGame(username, worldName, adminAccessBox.isSelected());
    }

    /**
     * Process registration
     */
    private void register() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Simple validation
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter username and password", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // For demo purposes, allow any registration
        JOptionPane.showMessageDialog(this, "Registration successful! You can now login.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Start the game
     */
    private void startGame(String username, String worldName, boolean adminAccess) {
        // Stop background music
        if (backgroundMusic != null && backgroundMusic.isRunning()) {
            backgroundMusic.stop();
            backgroundMusic.close();
        }

        // Here you would initialize your game
        // For example:
        // GameMain game = new GameMain(username, worldName, adminAccess);
        // game.start();

        // Close loading screen
        dispose();
    }

    /**
     * Play background music
     */
    private void playBackgroundMusic() {
        try {
            File musicFile = new File(BACKGROUND_MUSIC);
            if (musicFile.exists()) {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);
                backgroundMusic = AudioSystem.getClip();
                backgroundMusic.open(audioStream);
                backgroundMusic.loop(Clip.LOOP_CONTINUOUSLY);

                // Set lower volume
                FloatControl gainControl = (FloatControl) backgroundMusic.getControl(FloatControl.Type.MASTER_GAIN);
                gainControl.setValue(-10.0f); // Reduce volume by 10 decibels
            }
        } catch (Exception e) {
            System.out.println("Background music failed to load: " + e.getMessage());
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {
        try {
            // Use system look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create loading screen
        SwingUtilities.invokeLater(() -> new Loadingscreen());
    }
}