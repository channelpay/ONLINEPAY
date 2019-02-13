package com.example.store.model.shiro;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @since 2018-120-10
 * @author 26500
 * @用户管理 (springboot-jpa 生成数据表)
 */
@Entity
@Table(name = "STORE_USER")
public class User implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_user")
    @SequenceGenerator(name = "hibernate_user", sequenceName = "hibernate_user", allocationSize = 1)
    private Long id;
    @Column(unique = true)
    private String username;
    private String password;
    private String showname;
    @Column(unique = true)
    private String email;
    private String salt;
    private ShiroEnum userstatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Role> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getShowname() {
        return showname;
    }

    public void setShowname(String showname) {
        this.showname = showname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShiroEnum getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(ShiroEnum userstatus) {
        this.userstatus = userstatus;
    }

}
