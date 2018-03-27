package com.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.model.Student;

public interface StudentMapper {
	
	@Insert("INSERT INTO GG_Tab_anagrafe_discipline(Ds_disciplina_ad, Flg_sospeso_ad, Id_utente_ad"
			+ ") VALUES"
			+ "(1,1,1)")
//	@Options(useGeneratedKeys=true, keyProperty="id", flushCache=true, keyColumn="id")
	public void insertStudent(Student student);
		
	@Select("SELECT USERNAME as userName, PASSWORD as password, "
			+ "FIRSTNAME as firstName, LASTNAME as lastName, "
			+ "DATEOFBIRTH as dateOfBirth, EMAILADDRESS as emailAddress "
			+ "FROM student WHERE userName = #{userName}")
	public Student getStudentByUserName(String userName);

}
