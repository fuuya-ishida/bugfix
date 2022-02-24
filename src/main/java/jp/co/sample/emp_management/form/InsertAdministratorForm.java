package jp.co.sample.emp_management.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	//修正(1-2) 入力値エラー処理の追加
	@NotBlank(message="名前の入力は必須です")
	private String name;
	/** メールアドレス */
	//修正(1-2) 入力値エラー処理の追加
	@Email(message="Eメールの形式が不正です")
	@NotBlank(message="メールアドレスの入力は必須です")
	
	private String mailAddress;
	
	/** パスワード */
	//修正(1-2) 入力値エラー処理の追加
	@NotBlank(message="パスワードの入力は必須です")
	@Size(min=8,max=16,message="パスワードは8文字以上16文字以内で記載してください")
	private String password;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the mailAddress
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * @param mailAddress the mailAddress to set
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ "]";
	}
	
}
