package org.luanchcode.ExpenseTracker.controllers;

import org.luanchcode.ExpenseTracker.models.Expense;
import org.luanchcode.ExpenseTracker.models.data.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;



@Controller
public class HomeController {

    @Autowired
    private ExpenseRepository expenseRepository;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("expenses", expenseRepository.findAll());
        return "index";
    }

    @GetMapping("add")
    public String displayAddExpenseForm(Model model) {
        model.addAttribute(new Expense());
        return "add";
    }

    @PostMapping("add")
    public String processAddExpenseForm(@ModelAttribute @Valid Expense newExpense,
                                        Errors errors) {

        if (errors.hasErrors()) {
            return "add";
        }

        expenseRepository.save(newExpense);
        return "redirect:";
    }

    @GetMapping("view/{expenseId}")
    public String displayViewExpense(Model model, @PathVariable int expenseId) {

        Optional optExpense = expenseRepository.findById(expenseId);
        if (!optExpense.isEmpty()) {
            Expense job = (Expense) optExpense.get();
            model.addAttribute("expense", expenseId);
            return "view";
        } else {
            return "redirect:/";
        }
    }
}
