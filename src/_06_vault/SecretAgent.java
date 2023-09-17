package _06_vault;

public class SecretAgent {
	int findCode(Vault dljf){
		for(int i = 0; i<1_000_000; i++) {
			boolean isCode = dljf.tryCode(i);
			if (isCode){
				return i;
			}
			}
		return -1;
		}
	}

