package com.bsnbase.sdk.entity.res.fabric;

import com.bsnbase.sdk.entity.base.IBody;

import lombok.Data;

@Data
public class ResKeyEscrow implements IBody{
    com.bsnbase.sdk.entity.res.until.blockInfo blockInfo;
    com.bsnbase.sdk.entity.res.until.ccRes ccRes;
   
	@Override
	public String getEncryptionValue() {




		return (this.blockInfo.getTxId() == null?"":this.blockInfo.getTxId())
				+ (this.blockInfo.getBlockHash() == null?"":this.blockInfo.getBlockHash())
				+ (this.blockInfo.getStatus() == null?"":this.blockInfo.getStatus())
				+ (this.ccRes.getCcCode() == null?"":this.ccRes.getCcCode())
				+ (this.ccRes.getCcData() == null?"":this.ccRes.getCcData());
	}
}