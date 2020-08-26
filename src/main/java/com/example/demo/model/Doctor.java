package com.example.demo.model;

public class Doctor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_id
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    private Long doctorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_name
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    private String doctorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_number
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    private Long doctorNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_sex
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    private Integer doctorSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.doctor_level
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    private String doctorLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.department
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    private String department;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor.education
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    private String education;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_id
     *
     * @return the value of doctor.doctor_id
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    public Long getDoctorId() {
        return doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_id
     *
     * @param doctorId the value for doctor.doctor_id
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_name
     *
     * @return the value of doctor.doctor_name
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_name
     *
     * @param doctorName the value for doctor.doctor_name
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_number
     *
     * @return the value of doctor.doctor_number
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    public Long getDoctorNumber() {
        return doctorNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_number
     *
     * @param doctorNumber the value for doctor.doctor_number
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    public void setDoctorNumber(Long doctorNumber) {
        this.doctorNumber = doctorNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_sex
     *
     * @return the value of doctor.doctor_sex
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    public Integer getDoctorSex() {
        return doctorSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_sex
     *
     * @param doctorSex the value for doctor.doctor_sex
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    public void setDoctorSex(Integer doctorSex) {
        this.doctorSex = doctorSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.doctor_level
     *
     * @return the value of doctor.doctor_level
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    public String getDoctorLevel() {
        return doctorLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.doctor_level
     *
     * @param doctorLevel the value for doctor.doctor_level
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    public void setDoctorLevel(String doctorLevel) {
        this.doctorLevel = doctorLevel == null ? null : doctorLevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.department
     *
     * @return the value of doctor.department
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.department
     *
     * @param department the value for doctor.department
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor.education
     *
     * @return the value of doctor.education
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    public String getEducation() {
        return education;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor.education
     *
     * @param education the value for doctor.education
     *
     * @mbg.generated Wed Aug 26 10:25:53 CST 2020
     */
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }
}