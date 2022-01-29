package com.sinprochat.bot;


import java.util.ArrayList;
import java.util.List;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class SinproChatBotMain extends TelegramLongPollingBot {
	

	@Override
	public void onUpdateReceived(Update update) {
		// TODO Auto-generated method stub
		if (update.hasMessage()) {
			Message message = update.getMessage();
			String textMessage = message.getText();

			System.out.println("Messagenya dude ==> "+ textMessage);
			
			if (textMessage.equals("/start"))
			{
				SendMessage sendMessage = new SendMessage();
				sendMessage.setChatId(update.getMessage().getChatId().toString());
				sendMessage.setText("Hi, I’m Collarbear Automated Virtual Customer Service.\n"
						+"I can answer questions about Collarbear services.\n"
						+"Select a topic ortype-in your questions below.");
				
				// InlineKeyboardButton
				InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
				List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
				List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
				InlineKeyboardButton inlineKeyboardButtonBuyerChoices = new InlineKeyboardButton();
				InlineKeyboardButton inlineKeyboardButtonPartnerChoices = new InlineKeyboardButton();
				inlineKeyboardButtonBuyerChoices.setText("Buyer");
				inlineKeyboardButtonPartnerChoices.setText("Partner");
				inlineKeyboardButtonBuyerChoices.setCallbackData("Buyer");
				inlineKeyboardButtonPartnerChoices.setCallbackData("Partner");
				inlineKeyboardButtonList.add(inlineKeyboardButtonBuyerChoices);
				inlineKeyboardButtonList.add(inlineKeyboardButtonPartnerChoices);
				inlineButtons.add(inlineKeyboardButtonList);
				inlineKeyboardMarkup.setKeyboard(inlineButtons);
				sendMessage.setReplyMarkup(inlineKeyboardMarkup);
				
				System.out.println("Reply Messagenya dude ==> "+ sendMessage);
				
				try {
		            execute(sendMessage); // Call method to send the message
		        } catch (TelegramApiException e) {
		            e.printStackTrace();
		        }
			}
			
		}
		else if (update.hasCallbackQuery())
		{
			Message message = update.getCallbackQuery().getMessage(); //get Message from telegram
			var chatId = message.getChatId().toString(); // get chat id from telegram
			CallbackQuery callbackQuery = update.getCallbackQuery(); //get callback query from inline button
			String data = callbackQuery.getData(); // get value from callback query
			
			//define new message
			SendMessage sendMessage = new SendMessage();
			sendMessage.setParseMode(ParseMode.MARKDOWN);
			sendMessage.setChatId(chatId); //get chat id from message
			
			if (data.equals("Buyer"))
			{
			
				sendMessage.setText("About Buyer");
				
				//InlineKeyboard
				InlineKeyboardMarkup inleInlineKeyboardMarkupBuyerInlineKeyboardMarkup = new InlineKeyboardMarkup();
				List<List<InlineKeyboardButton>> inlineButtonBuyerList = new ArrayList<>();
				
				List<InlineKeyboardButton> inlineKeyboardButtonsWhatIsCollarBear = new ArrayList<>();
				List<InlineKeyboardButton> inlineKeyboardButtonsHowToHirePartner = new ArrayList<>();
				List<InlineKeyboardButton> inlineKeyboardButtonsHowToPostJobRequest = new ArrayList<>();
				List<InlineKeyboardButton> inlineKeyboardJobAvailableCollarBear = new ArrayList<>();
				List<InlineKeyboardButton> inlineKeyboardAllowedMeetFreelancerCollarBear = new ArrayList<>();
				List<InlineKeyboardButton> inlineKeyboardButtonsServicePriceCollarBear = new ArrayList<>();
				List<InlineKeyboardButton> inlineKeyboardButtonsCoLabs= new ArrayList<>();
				
				InlineKeyboardButton inlineKeyboardButtonWhatIsCollarBear = new InlineKeyboardButton();
				InlineKeyboardButton inlineKeyboardButtonHowToHirePartner = new InlineKeyboardButton();
				InlineKeyboardButton inlineKeyboardButtonHowToPostJobRequest = new InlineKeyboardButton();
				InlineKeyboardButton inlineKeyboardButtonJobAvailableCollarBear = new InlineKeyboardButton();
				InlineKeyboardButton inlineKeyboardButtonAllowedMeetFreelancerCollarBear = new InlineKeyboardButton();
				InlineKeyboardButton inlineKeyboardButtonServicePriceCollarBear = new InlineKeyboardButton();
				InlineKeyboardButton inlineKeyboardButtonCoLabs = new InlineKeyboardButton();
				
				inlineKeyboardButtonWhatIsCollarBear.setText("What is Collarbear?");
				inlineKeyboardButtonHowToHirePartner.setText("How to hire a partner?");
				inlineKeyboardButtonHowToPostJobRequest.setText("How to post a job request?");
				inlineKeyboardButtonJobAvailableCollarBear.setText("What kind of a job that available in Collarbear?");
				inlineKeyboardButtonAllowedMeetFreelancerCollarBear.setText("Am I allowed to meet the freelancer?");
				inlineKeyboardButtonServicePriceCollarBear.setText("How much is the service price in Collarbear?");
				inlineKeyboardButtonCoLabs.setText("What is Co-Labs?");
				inlineKeyboardButtonWhatIsCollarBear.setCallbackData("1");
				inlineKeyboardButtonHowToHirePartner.setCallbackData("2");
				inlineKeyboardButtonHowToPostJobRequest.setCallbackData("3");
				inlineKeyboardButtonJobAvailableCollarBear.setCallbackData("4");
				inlineKeyboardButtonAllowedMeetFreelancerCollarBear.setCallbackData("5");
				inlineKeyboardButtonServicePriceCollarBear.setCallbackData("6");
				inlineKeyboardButtonCoLabs.setCallbackData("7");
				
				inlineKeyboardButtonsWhatIsCollarBear.add(inlineKeyboardButtonWhatIsCollarBear);
				inlineKeyboardButtonsHowToHirePartner.add(inlineKeyboardButtonHowToHirePartner);
				inlineKeyboardButtonsHowToPostJobRequest.add(inlineKeyboardButtonHowToPostJobRequest);
				inlineKeyboardJobAvailableCollarBear.add(inlineKeyboardButtonJobAvailableCollarBear);
				inlineKeyboardAllowedMeetFreelancerCollarBear.add(inlineKeyboardButtonAllowedMeetFreelancerCollarBear);
				inlineKeyboardButtonsServicePriceCollarBear.add(inlineKeyboardButtonServicePriceCollarBear);
				inlineKeyboardButtonsCoLabs.add(inlineKeyboardButtonCoLabs);
				
				inlineButtonBuyerList.add(inlineKeyboardButtonsWhatIsCollarBear);
				inlineButtonBuyerList.add(inlineKeyboardButtonsHowToHirePartner);
				inlineButtonBuyerList.add(inlineKeyboardButtonsHowToPostJobRequest);
				inlineButtonBuyerList.add(inlineKeyboardJobAvailableCollarBear);
				inlineButtonBuyerList.add(inlineKeyboardAllowedMeetFreelancerCollarBear);
				inlineButtonBuyerList.add(inlineKeyboardButtonsServicePriceCollarBear);
				inlineButtonBuyerList.add(inlineKeyboardButtonsCoLabs);
				
				inleInlineKeyboardMarkupBuyerInlineKeyboardMarkup.setKeyboard(inlineButtonBuyerList);
				sendMessage.setReplyMarkup(inleInlineKeyboardMarkupBuyerInlineKeyboardMarkup);
				
				try {
		            execute(sendMessage); // Call method to send the message
		        } catch (TelegramApiException e) {
		            e.printStackTrace();
		        }
			}
			else if (data.equals("Partner"))
			{
				sendMessage.setText("About Partner");
				
				//InlineKeyboard
				InlineKeyboardMarkup inlineKeyboardMarkupPartner = new InlineKeyboardMarkup();
				List<List<InlineKeyboardButton>> inlineButtonPartnerList = new ArrayList<>();
				
				List<InlineKeyboardButton> inlineKeyboardButtonsWhatIsCollarBear = new ArrayList<>();
				List<InlineKeyboardButton> inlineKeyboardButtonsHowToRegisterPartner = new ArrayList<>();
				List<InlineKeyboardButton> inlineKeyboardButtonsAdvantagesCollarBear  = new ArrayList<>();
				List<InlineKeyboardButton> inlineKeyboardButtonsGetJobCollarBear = new ArrayList<>();
				List<InlineKeyboardButton> inlineKeyboardButtonsFeesCollarBear = new ArrayList<>();
				List<InlineKeyboardButton> inlineKeyboardButtonsCoLabs= new ArrayList<>();
				
				InlineKeyboardButton inlineKeyboardButtonWhatIsCollarBear = new InlineKeyboardButton();
				InlineKeyboardButton inlineKeyboardButtonHowToRegisterPartner = new InlineKeyboardButton();
				InlineKeyboardButton inlineKeyboardButtonAdvantagesCollarBear = new InlineKeyboardButton();
				InlineKeyboardButton inlineKeyboardButtonGetJobCollarBear = new InlineKeyboardButton();
				InlineKeyboardButton inlineKeyboardButtonFeesCollarBear = new InlineKeyboardButton();
				InlineKeyboardButton inlineKeyboardButtonCoLabs = new InlineKeyboardButton();
				
				inlineKeyboardButtonWhatIsCollarBear.setText("What is Collarbear?");
				inlineKeyboardButtonHowToRegisterPartner.setText("How to register as a Partner?");
				inlineKeyboardButtonAdvantagesCollarBear.setText("What is the advantages of using Collarbear?");
				inlineKeyboardButtonGetJobCollarBear.setText("How to get a job in Collarbear?");
				inlineKeyboardButtonFeesCollarBear.setText("What fees does Collarbear charge?");
				inlineKeyboardButtonCoLabs.setText("What is Co-Labs?");

				inlineKeyboardButtonWhatIsCollarBear.setCallbackData("1");
				inlineKeyboardButtonHowToRegisterPartner.setCallbackData("8");
				inlineKeyboardButtonAdvantagesCollarBear.setCallbackData("9");
				inlineKeyboardButtonGetJobCollarBear.setCallbackData("10");
				inlineKeyboardButtonFeesCollarBear.setCallbackData("11");
				inlineKeyboardButtonCoLabs.setCallbackData("7");
				
				inlineKeyboardButtonsWhatIsCollarBear.add(inlineKeyboardButtonWhatIsCollarBear);
				inlineKeyboardButtonsHowToRegisterPartner.add(inlineKeyboardButtonHowToRegisterPartner);
				inlineKeyboardButtonsAdvantagesCollarBear.add(inlineKeyboardButtonAdvantagesCollarBear);
				inlineKeyboardButtonsGetJobCollarBear.add(inlineKeyboardButtonGetJobCollarBear);
				inlineKeyboardButtonsFeesCollarBear.add(inlineKeyboardButtonFeesCollarBear);
				inlineKeyboardButtonsCoLabs.add(inlineKeyboardButtonCoLabs);
				
				inlineButtonPartnerList.add(inlineKeyboardButtonsWhatIsCollarBear);
				inlineButtonPartnerList.add(inlineKeyboardButtonsHowToRegisterPartner);
				inlineButtonPartnerList.add(inlineKeyboardButtonsAdvantagesCollarBear);
				inlineButtonPartnerList.add(inlineKeyboardButtonsGetJobCollarBear);
				inlineButtonPartnerList.add(inlineKeyboardButtonsFeesCollarBear);
				inlineButtonPartnerList.add(inlineKeyboardButtonsCoLabs);
				
				inlineKeyboardMarkupPartner.setKeyboard(inlineButtonPartnerList);
				sendMessage.setReplyMarkup(inlineKeyboardMarkupPartner);
				
				try {
		            execute(sendMessage); // Call method to send the message
		        } catch (TelegramApiException e) {
		            e.printStackTrace();
		        }
			}
			System.out.println("CALLBACK QUERYNYA DUDE==> "+ data);
		}
	}

	@Override
	public String getBotUsername() {
		// TODO Auto-generated method stub
		return "TurnIfCodeChatBot";
	}

	@Override
	public String getBotToken() {
		// TODO Auto-generated method stub
		return "5054235732:AAHSTPPNTfG4d_5vjDE7I8N6Pv_hAIYScpk";
	}
	
}
