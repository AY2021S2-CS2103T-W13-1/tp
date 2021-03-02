package seedu.dictionote.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.dictionote.logic.parser.CliSyntax.*;

import seedu.dictionote.logic.commands.enums.UiAction;
import seedu.dictionote.logic.commands.enums.UiActionOption;
import seedu.dictionote.model.Model;


/**
 * Format full help instructions for every command for display.
 */
public class CloseCommand extends Command {

    public static final String COMMAND_WORD = "close";

    public static final String MESSAGE_USAGE = COMMAND_WORD
        + ": Close UI Panel.\n"
        + "Option Available: "
        + OPTION_ALL_PANEL + ", "
        + OPTION_CONTENT_PANEL + ", "
        + OPTION_DICTIONARY_CONTENT_PANEL + ", "
        + OPTION_DICTIONARY_LIST_PANEL + ", "
        + OPTION_DICTIONARY_PANEL + ", "
        + OPTION_LIST_PANEL + ", "
        + OPTION_NOTE_CONTENT_PANEL + ", "
        + OPTION_NOTE_LIST_PANEL + ", "
        + OPTION_NOTE_PANEL + ".\n"
        + "Example: " + COMMAND_WORD + " -c ";

    public static final String SHOWING_OPEN_MESSAGE = "Panel closed.";


    private final UiActionOption uiActionOption;

    /**
     * Creates an OpenCommand to add the specified {@code Option}
     */
    public CloseCommand(UiActionOption uiActionOption) {
        requireNonNull(uiActionOption);

        this.uiActionOption = uiActionOption;
    }


    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(SHOWING_OPEN_MESSAGE, UiAction.OPEN, uiActionOption);

    }
}
