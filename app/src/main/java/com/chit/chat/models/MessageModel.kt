package com.chit.chat.models

import com.chit.chat.utils.DateUtil.dateFromMiliSecSinceEpoch

data class MessageModel(val message: String = "",
                        val chat_id: String = "",
                        val sender_uid: String = "",
                        val timestamp: Long = 0L,
                        val status: HashMap<String, String> = hashMapOf()) {

    val timeDateString: String
        get() = dateFromMiliSecSinceEpoch(timestamp)
}

