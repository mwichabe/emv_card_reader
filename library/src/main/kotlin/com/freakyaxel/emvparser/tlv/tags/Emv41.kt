package com.freakyaxel.emvparser.tlv.tags

import com.freakyaxel.emvparser.tlv.TagTLV

internal enum class Emv41(val key: Int, val type: Emv41Type) {
    BIC(0x5F54, Emv41Type.TLV),
    IBAN(0x5F53, Emv41Type.TLV),
    FCI_Issuer_Discretionary_DATA(0xBF0C, Emv41Type.TLV),
    READ_RECORD_Response_Message_Template(0x70, Emv41Type.TLV),
    Response_Message_Template_Format_1(0x80, Emv41Type.TLV),
    Response_Message_Template_Format_2(0x77, Emv41Type.TLV),
    DF_FCI(0x6F, Emv41Type.TLV),
    DF_FCI_PROPRIETARY(0xA5, Emv41Type.TLV),
    PSE_ENTRY(0x61, Emv41Type.TLV),
    Application_Primary_Account_Number_PAN(0x5A, Emv41Type.OTHER),
    Application_Expiration_Date(0x5F24, Emv41Type.OTHER),
    Application_Usage_Control(0x9F07, Emv41Type.OTHER),
    Log_Entry_SFI(0x9F4D, Emv41Type.OTHER),
    AFL(0x94, Emv41Type.OTHER),
    PDOL(0x9F38, Emv41Type.OTHER),
    KERNEL_IDENTIFIER(0x9F2A, Emv41Type.OTHER),
    DF_FCI_SFI(0x88, Emv41Type.OTHER),
    DF_FCI_NAME(0x84, Emv41Type.OTHER),
    DF_FCI_LANG(0x5F2D, Emv41Type.OTHER),
    DF_ADF_NAME(0x4F, Emv41Type.OTHER),
    DF_ADF_LABEL(0x50, Emv41Type.OTHER),
    DF_ADF_PREFERRED_NAME(0x9F12, Emv41Type.OTHER),
    DF_ADF_PRIORITY(0x87, Emv41Type.OTHER),
    TRACK2_EQUIV_DATA(0x57, Emv41Type.OTHER),
    CARDHOLDER_NAME(0x5F20, Emv41Type.OTHER);

    companion object {
        private var byTag: HashMap<Int, Emv41> = HashMap(values().associateBy { it.key })

        fun getByTag(tagId: Int?): Emv41? {
            return byTag[tagId]
        }

        fun getByTag(tag: TagTLV) = getByTag(tag.key)
    }
}