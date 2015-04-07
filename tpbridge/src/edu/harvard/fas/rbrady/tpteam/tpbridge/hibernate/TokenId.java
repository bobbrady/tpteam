package edu.harvard.fas.rbrady.tpteam.tpbridge.hibernate;

// Generated Nov 10, 2006 5:22:58 PM by Hibernate Tools 3.2.0.beta8

/**
 * TokenId generated by hbm2java
 */
public class TokenId implements java.io.Serializable {

	// Fields    

	private static final long serialVersionUID = 1L;

	private int userId;

	private String tokenId;

	// Constructors

	/** default constructor */
	public TokenId() {
	}

	/** full constructor */
	public TokenId(int userId, String tokenId) {
		this.userId = userId;
		this.tokenId = tokenId;
	}

	// Property accessors
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTokenId() {
		return this.tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TokenId))
			return false;
		TokenId castOther = (TokenId) other;

		return (this.getUserId() == castOther.getUserId())
				&& ((this.getTokenId() == castOther.getTokenId()) || (this
						.getTokenId() != null
						&& castOther.getTokenId() != null && this.getTokenId()
						.equals(castOther.getTokenId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserId();
		result = 37 * result
				+ (getTokenId() == null ? 0 : this.getTokenId().hashCode());
		return result;
	}

}
