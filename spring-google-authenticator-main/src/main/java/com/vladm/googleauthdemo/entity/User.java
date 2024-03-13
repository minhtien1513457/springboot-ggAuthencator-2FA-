package com.vladm.googleauthdemo.entity;

import lombok.*;

import javax.persistence.*;

/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "user_name")
	private String userName;

	private String secret;
}