package persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by danielsauve on 2017-02-16.
 */
@Controller
public class WebController {
    private AddressBookRepository addressBookRepository;
    private BuddyInfoRepository buddyInfoRepository;

    @Autowired
    public WebController(AddressBookRepository addressBookRepository, BuddyInfoRepository buddyInfoRepository) {
        this.addressBookRepository = addressBookRepository;
        this.buddyInfoRepository = buddyInfoRepository;
    }

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("addressBook", new AddressBook());
        model.addAttribute("buddy", new BuddyInfo());
        return "greeting";
    }

    @PostMapping("/buddyAdd")
    public String buddySubmit(@ModelAttribute("buddy") BuddyInfo buddyInfo) {
        AddressBook addressBook = addressBookRepository.findOne(1L);
        addressBook.addBuddy(buddyInfo);
        buddyInfoRepository.save(buddyInfo);
        addressBookRepository.save(addressBook);
        return "buddy";
    }

    @PostMapping("/addressBookCreate")
    public String addressBookSubmit(Model model){
        if (addressBookRepository.findOne(1L) == null){
            addressBookRepository.save(new AddressBook());
        }
        AddressBook addressBook = addressBookRepository.findOne(1L);
        model.addAttribute("addressBook", addressBook);
        return "addressBook";
    }
}
