package net.shadowfacts.discordchat.core.util;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.requests.RestAction;

/**
 * @author shadowfacts
 */
public class QueuedMessage {

	private final String message;
	private final MessageChannel channel;

	public QueuedMessage(String message, MessageChannel channel) {
		this.message = message;
		this.channel = channel;
	}

	public String getMessage() {
		return message;
	}

	public MessageChannel getChannel() {
		return channel;
	}

	public RestAction<Message> send() {
		return channel.sendMessage(message);
	}

}
