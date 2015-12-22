package com.yash.trainingmanagement.bean;



import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.commons.io.FilenameUtils;

import com.yash.trainingmanagement.domain.Course;

import com.yash.trainingmanagement.service.CourseServiceLocal;

@ManagedBean
@SessionScoped
public class CourseBean {
	
	private String course_title;
	private String Description;
	private String reference_code;
	private boolean course_status;
	private String course_status_str;
	private String course_status_rev;
	private Part file;
	
	
	Course courseRef;
	Course courseRef1;


	HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
	int userId=(int)session.getAttribute("user");
	@Inject
	Course course;
	@EJB
	CourseServiceLocal courseServiceLocal;
	
	List<Course> courseList=new ArrayList<>();
	List<Course> courseList1 =new ArrayList<>();
	
	

	public Part getFile() {
		return file;
	}

	public void setFile(Part file) {
		this.file = file;
	}

	public List<Course> getCourseList1() {
		courseList1=courseServiceLocal. fetchTotalActiveCourses();
		return courseList1;
	}

	public void setCourseList1(List<Course> courseList1) {
		this.courseList1 = courseList1;
	}

	public Course getCourseRef1() {
		//courseRef=courseServiceLocal.ViewCourse(course_status_rev);
		courseRef1=courseServiceLocal.ViewCourse(course_status_rev);
		return courseRef1;
	}

	public void setCourseRef1(Course courseRef1) {
		this.courseRef1 = courseRef1;
	}

	public Course getCourseRef() {
		
		return courseRef;
	}

	public void setCourseRef(Course courseRef) {
		
		this.courseRef = courseRef;
	}

	public String getCourse_status_rev() {
		return course_status_rev;
	}

	public void setCourse_status_rev(String course_status_rev) {
		this.course_status_rev = course_status_rev;
	}

	public String getCourse_status_str() {
		return course_status_str;
	}

	public void setCourse_status_str(String course_status_str) {
		this.course_status_str = course_status_str;
	}

	public List<Course> getCourseList() {
		courseList=courseServiceLocal.displayCourse(userId);
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public String getCourse_title() {
		return course_title;
	}

	public void setCourse_title(String course_title) {
		this.course_title = course_title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getReference_code() {
		return reference_code;
	}

	public void setReference_code(String reference_code) {
		this.reference_code = reference_code;
	}

	public boolean isCourse_status() {
		return course_status;
	}

	public void setCourse_status(boolean course_status) {
		this.course_status = course_status;
	}

	public String createCourse(){
		return "addCourse";
	}
	
	public String saveCourse(){
		course.setCourse_title(course_title);
		course.setDescription(Description);
		course.setReference_code(reference_code);
		course.setCourse_status(course_status);
		
		courseServiceLocal.saveCourse(course, userId);
		return "";
	}
	
	public String displayCourse()
	{
		
		return "displayCourseFacelet";
	}
	
	public String changeCourseStatus()
	{	
		
		int rev_status=courseServiceLocal.getCourse_Id(course_status_rev);
		System.out.println(rev_status);
		courseServiceLocal.changeCourseStatus(rev_status,course_status_rev);
		
		return null;
	}
	
	public String deleteCourse(){
		courseServiceLocal.deleteCourse(course_status_rev);
		return null;
	}
	
	public String viewCourse(){
		courseRef=courseServiceLocal.ViewCourse(course_status_rev);
		return "viewCourseFacelet";
	}
	
	public String viewCourse1()
	{
		//courseRef1=courseServiceLocal.ViewCourse(course_status_rev);
		return "updateCourseForTrainer";
	}
	
	public String uploadFileValue(){
		Part uploadedFile = getFile();
        File file = new java.io.File("C:/Users/ram.somani/wildfly/TrainingManagement/WebContent/assignments");   
        String  abspath=file.getAbsolutePath();    
        final Path destination = Paths.get(abspath+"/" + FilenameUtils.getName(getSubmittedFileName(uploadedFile)));
        InputStream bytes = null;

        if (null != uploadedFile) {

        try {
            bytes = uploadedFile.getInputStream();
            Files.copy(bytes, destination);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        }
		return null;
	}
	
	 public static String getSubmittedFileName(Part filePart) {
		    String header = filePart.getHeader("content-disposition");
		    if (header == null)
		    return null;
		    for (String headerPart : header.split(";")) {
		    	if (headerPart.trim().startsWith("filename")) {
		    		return headerPart.substring(headerPart.indexOf('=') + 1).trim().replace("\"", "");
		    		}
		    	}
		    return null;
		    }
	

}
