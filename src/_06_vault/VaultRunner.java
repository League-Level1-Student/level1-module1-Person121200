package _06_vault;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();
		SecretAgent secret = new SecretAgent();
		System.out.println(secret.findCode(vault));
	}
}
