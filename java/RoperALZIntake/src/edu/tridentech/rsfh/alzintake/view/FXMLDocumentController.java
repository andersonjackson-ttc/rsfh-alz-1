/*
 * see FXML variables commented out below
 */
package edu.tridentech.rsfh.alzintake.view;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import edu.tridentech.rsfh.alzintake.dao.DataReadWrite;
import edu.tridentech.rsfh.alzintake.model.Participant;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;



/**
 *
 * @author 5JLBt1
 */

public class FXMLDocumentController implements Initializable {
    
	
	
	 @FXML
	    private Text actiontarget;
	    @FXML private TextField subjectFirstNameTxtBx;
	    @FXML private TextField subjectMITxtBx;
	    @FXML private TextField subjectLastNameTxtBx;
	    @FXML private TextField subjectDOBTxtBx;
	    @FXML private TextField subjectAddressTxtBx;    
	    @FXML private TextField subjectCityTxtBx;
	    @FXML private TextField subjectStateTxtBx;
	    @FXML private TextField subjectZipTxtBx;
	    @FXML private TextField subjectEmailTxtBx;
	    @FXML private TextField subjectPhoneTxtBx;
	    @FXML private TextField subjectCellTxtBx;
	    @FXML private TextField subjectPcpTxtBx;
	    @FXML private TextField subjectSpecialistTxtBx;
	    
	    @FXML private ComboBox<String> subjectReferralDrpDn;
	    
	    @FXML private CheckBox hpoaStatusCkBxY;
	    
	    
	    private ObservableList<String> TYPE = FXCollections.observableList("23andMe referral", "A4 AARP Ad", "A4 direct mailing", "A4 Facebook Ad", "ADNI3 - Brain Health Registry", "Advantage Magazine", "Community Event", "Facebook Ad - Biogen", "GeneMatch", "GeneMatch- community event", "Health Fair", "Housecalls Magazine", "Housecalls TV", "Memory Screen Day", "Merck Referral", "News Story-Print/TV", "Other", "P&C Ad", "Radio", "Referral- Friend", "Referral- Patient", "Referral- study website", "Referral-Community Partner", "Referral-Physician", "Referral-VA", "Roper Recording", "Web Search", "Word of Mouth");        
	    
	   
	    @FXML
	    private void handleSubmitButtonAction(ActionEvent event) throws ParseException {
	    	String subFirstName = "";
	    	String subMiddleInit = "";
	    	String subLastName = "";
	    	String subDOBStr = "";
	    	Date subDOB;
	    	String subAddress = "";
	    	String subCity = "";
	    	String subState = "";
	    	String subZip = "";
	    	String subEmail = "";
	    	String subPhone = "";
	    	String subCell = "";
	    	String subPCP = "";
	    	String subSpecialist = "";
	    	String subjectReferral = "";
	    	
	    	SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yyyy");
	    	
	    	
	    	subFirstName = subjectFirstNameTxtBx.getText();
	    	subMiddleInit = subjectMITxtBx.getText();
	    	subLastName = subjectLastNameTxtBx.getText();
	    	subDOBStr = subjectDOBTxtBx.getText();
	    	subDOB = dateParser.parse(subDOBStr);
	    	subAddress = subjectAddressTxtBx.getText();
	    	subCity = subjectCityTxtBx.getText();
	    	subState = subjectStateTxtBx.getText();
	    	subZip = subjectZipTxtBx.getText();
	    	subEmail = subjectEmailTxtBx.getText();
	    	subPhone = subjectPhoneTxtBx.getText();
	    	subCell = subjectCellTxtBx.getText();
	    	subPCP = subjectPcpTxtBx.getText();
	    	subSpecialist = subjectSpecialistTxtBx.getText();
	    	subjectReferral = subjectReferralDrpDn.getSelectionModel().getSelectedItem();
	
	     
	    	Participant partic = new Participant();
	    	partic.setFirstName(subFirstName);
	    	partic.setLastName(subLastName);
	    	partic.setDOB(subDOB);
	    	partic.setAddress(subAddress);
	    	partic.setCity(subCity);
	    	partic.setState(subState);
	    	partic.setZip(subZip);
	    	partic.setEmail(subEmail);
	    	partic.setPhone(subPhone);
	    	partic.setCell(subCell);
	    	partic.setPcp(subPCP);
	    	partic.setSpec(subSpecialist);
	    	partic.setReferral(subjectReferral);
	    	
	    	DataReadWrite writer = DataReadWrite.getInstance();
	    	writer.writeRecord(partic);
	    	
	    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
// @FXML private DatePicker intakeScreenDateTxtBx;
//   @FXML private ComboBox intakeScreenByDrpDn;
//   @FXML private TextField subjectFirstNameTxtBx;
//   @FXML private TextField subjectMITxtBx;
//   @FXML private TextField subjectLastNameTxtBx;
//   @FXML private TextField subjectDOBTxtBx;
//   @FXML private TextField subjectAddressTxtBx;
//   @FXML private TextField subjectStateTxtBx;
//   @FXML private TextField subjectZipTxtBx;
//   @FXML private CheckBox hpoaStatusCkBxY;
//   @FXML private CheckBox hpoaStatusCkBxN;
//   @FXML private TextField subjectEmailTxtBx;
//   @FXML private TextField subjectPhoneTxtBx;
//   @FXML private TextField subjectCellTxtBx;
//   @FXML private TextField subjectPcpTxtBx;
//   @FXML private TextField subjectCityTxtBx;
//   @FXML private TextField subjectSpecialistTxtBx;
//   @FXML private TextField hpoaFirstNameTxtBx;
//   @FXML private TextField hpoaLastNameTxtBx;
//   @FXML private TextField hpoaPhoneTxtBx;
//   @FXML private ComboBox subjectReferralDrpDn;
//   @FXML private CheckBox studyPartnerStatusTglBtn;
//   @FXML private TextField studyPartnerRelationTxtBx;
//   @FXML private TextField studyPartnerPhoneTxtBx;
//   @FXML private TextField studyPartnerEmailTxtBx;
//   @FXML private TextField studyPartnerLastNameTxtBx;
//   @FXML private TextField studyPartnerFirstNameTxtBx;
//   @FXML private TextField hpoaSpousePhoneTxtBx;
//   @FXML private TextField hpoaSpouseLastNameTxtBx;
//   @FXML private TextField hpoaSpouseFirstNameTxtBx;
//   @FXML private CheckBox hpoaMarriedStatusCkBxN;
//   @FXML private CheckBox hpoaMarriedStatusCkBxY;
//   @FXML private CheckBox hpoaChildStatusCkBxY;
//   @FXML private CheckBox hpoaChildStatusCkBxN;
//   @FXML private TextField hpoaChildFirstNameTxtBx;
//   @FXML private TextField hpoaChildLastNameTxtBx;
//   @FXML private TextField hpoaChildPhoneTxtBx;