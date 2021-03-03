package com.codeifi.springbootuploadfiledatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeifi.springbootuploadfiledatabase.models.FileDB;

public interface FileDBRepository  extends JpaRepository<FileDB, String> {
	

}
