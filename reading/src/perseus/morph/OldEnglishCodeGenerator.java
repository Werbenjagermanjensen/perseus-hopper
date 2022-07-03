package perseus.morph;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import static perseus.morph.MorphCode.*;

/**
 * Class that maps between the morphological code in the database
 * and the representation of the morphological code in the 
 * Java classes
*/
public class OldEnglishCodeGenerator implements MorphCodeGenerator {
    
    private static Logger logger = Logger.getLogger(OldEnglishCodeGenerator.class);

    /**
     * Return the morphological code, as it appears in the database
     * given a map of features.
     *
     * @param features a map of features
     * @return a String representing the morph code as it
     * appears in the database
    */
    public String getCode(Map<String, String> features) {
	StringBuffer code = new StringBuffer();

	// part of speech
	if (! features.containsKey(POSITIVE)) {
	    code.append("-");
	}
	else {
	    String value = features.get(POSITIVE);
	    if (value.equals(NOUN)) {
		code.append("n");
	    }
	    else if (value.equals(VERB)) {
		code.append("v");
	    }
	    else if (value.equals(ADJECTIVE)) {
		code.append("a");
	    }
	    else if (value.equals(ADVERB)) {
		code.append("d");
	    }
	    else if (value.equals(CONJUNCTION)) {
		code.append("c");
	    }
	    else if (value.equals(PREPOSITION)) {
		code.append("r");
	    }
	    else if (value.equals(INTERJECTION)) {
		code.append("i");
	    }
	    else if (value.equals(EXCLAMATION)) {
		code.append("e");
	    }
	    else if (value.equals(PARTICIPLE)) {
		code.append("p");
	    }
	    else if (value.equals(UNSPECIFIED)) {
		code.append("-");
	    }
	    else {
		logger.warn("Unrecognized pos code: " + value);
		code.append("!");
	    }
	}

	// person
	if (! features.containsKey(PERSON)) {
	    code.append("-");
	}
	else {
	    String value = features.get(PERSON);
	    if (value.equals(FIRST_PERSON)) {
		code.append("1");
	    }
	    else if (value.equals(SECOND_PERSON)) {
		code.append("2");
	    }
	    else if (value.equals(THIRD_PERSON)) {
		code.append("3");
	    }
	    else {
		logger.warn("Unrecognized person code: " + value);
		code.append("!");
	    }
	}

	// number
	if (! features.containsKey(NUMBER)) {
	    code.append("-");
	}
	else {
	    String value = features.get(NUMBER);
	    if (value.equals(SINGULAR)) {
		code.append("s");
	    }
	    else if (value.equals(PLURAL)) {
		code.append("p");
	    }
	    else {
		logger.warn("Unrecognized number code: " + value);
		code.append("!");
	    }
	}

	// tense
	if (! features.containsKey(TENSE)) {
	    code.append("-");
	}
	else {
	    String value = features.get(TENSE);
	    if (value.equals(PRESENT)) {
		code.append("p");
	    }
	    else if (value.equals(PAST_ABSOLUTE)) {
		code.append("r");
	    }
	    else if (value.equals(PLUPERFECT)) {
		code.append("l");
	    }
	    else if (value.equals(FUTURE_PERFECT)) {
		code.append("t");
	    }
	    else if (value.equals(FUTURE)) {
		code.append("f");
	    }
	    else {
		logger.warn("Unrecognized tense code: " + value);
		code.append("!");
	    }
	}

	// mood
	if (! features.containsKey(MOOD)) {
	    code.append("-");
	}
	else {
	    String value = features.get(MOOD);
	    if (value.equals("indic")) {
		code.append("i");
	    }
	    else if (value.equals(SUBJUNCTIVE)) {
		code.append("s");
	    }
	    else if (value.equals(INFINITIVE)) {
		code.append("n");
	    }
	    else if (value.equals(IMPERATIVE)) {
		code.append("m");
	    }
	    else if (value.equals(PARTICIPLE)) {
		code.append("p");
	    }
	    else {
		logger.warn("Unrecognized mood code: " + value);
		code.append("!");
	    }
	}

	// voice
	if (! features.containsKey(VOICE)) {
	    code.append("-");
	}
	else {
	    String value = features.get(VOICE);
	    if (value.equals(ACTIVE)) {
		code.append("a");
	    }
	    else if (value.equals(PASSIVE)) {
		code.append("p");
	    }
	    else if (value.equals(MEDIO_PASSIVE)) {
		code.append("e");
	    }
	    else {
		logger.warn("Unrecognized voice code: " + value);
		code.append("!");
	    }
	}

	// gender
	if (! features.containsKey(GENDER)) {
	    code.append("-");
	}
	else {
	    String value = features.get(GENDER);
	    if (value.equals(MASCULINE)) {
		code.append("m");
	    }
	    else if (value.equals(FEMININE)) {
		code.append("f");
	    }
	    else if (value.equals(NEUTER)) {
		code.append("n");
	    }
	    else {
		logger.warn("Unrecognized gender code: [" + value + "]");
		code.append("!");
	    }
	}

	// case
	if (! features.containsKey(CASE)) {
	    code.append("-");
	}
	else {
	    String value = features.get(CASE);
	    if (value.equals(NOMINATIVE)) {
		code.append("n");
	    }
	    else if (value.equals(GENITIVE)) {
		code.append("g");
	    }
	    else if (value.equals(DATIVE)) {
		code.append("d");
	    }
	    else if (value.equals(ACCUSATIVE)) {
		code.append("a");
	    }
	    else if (value.equals(ABLATIVE)) {
		code.append("b");
	    }
	    else if (value.equals(VOCATIVE)) {
		code.append("v");
	    }
	    else if (value.equals(LOCATIVE)) {
		code.append("l");
	    }
	    else if (value.equals(INSTRUMENTAL)) {
		code.append("i");
	    }
	    else {
		logger.warn("Unrecognized case code: " + value);
		code.append("!");
	    }
	}

	// degree
	if (! features.containsKey(DEGREE)) {
	    code.append("-");
	}
	else {
	    String value = features.get(DEGREE);
	    if (value.equals(COMPARATIVE)) {
		code.append("c");
	    }
	    else if (value.equals(SUPERLATIVE)) {
		code.append("s");
	    }
	    else {
		logger.warn("Unrecognized degree code: " + value);
		code.append("!");
	    }
	}
	

	return code.toString();
    }

    /**
     * Given a string that represents a morphological code in the database
     * return a map representation of the morphological code.
     *
     * @param code the morph code
     * @return a map of features
     */
    public Map<String, String> getFeatures(String code) {
        char[] chars = code.toCharArray();
        Map<String,String> features = new HashMap<String,String>();

        char pos = chars[0];
        if (pos == 'n') {
            features.put(PART_OF_SPEECH, NOUN);
        }
        else if (pos == 'v') {
            features.put(PART_OF_SPEECH, VERB);
        }
        else if (pos == 't') {
            features.put(PART_OF_SPEECH, PARTICIPLE);
        }
        else if (pos == 'a') {
            features.put(PART_OF_SPEECH, ADJECTIVE);
        }
        else if (pos == 'd') {
            features.put(PART_OF_SPEECH, ADVERB);
        }
        else if (pos == 'c') {
            features.put(PART_OF_SPEECH, CONJUNCTION);
        }
        else if (pos == 'r') {
            features.put(PART_OF_SPEECH, PREPOSITION);
        }
        else if (pos == 'p') {
            features.put(PART_OF_SPEECH, PRONOUN);
        }
        else if (pos == 'm') {
            features.put(PART_OF_SPEECH, NUMERAL);
        }
        else if (pos == 'i') {
            features.put(PART_OF_SPEECH, INTERJECTION);
        }
        else if (pos == 'e') {
            features.put(PART_OF_SPEECH, EXCLAMATION);
        }
        
        char person = chars[1];
        if (person == '1') {
            features.put(PERSON, FIRST_PERSON);
        }
        else if (person == '2') {
            features.put(PERSON, SECOND_PERSON);
        }
        else if (person == '3') {
            features.put(PERSON, THIRD_PERSON);
        }
        
        char number = chars[2];
        if (number == 's') {
            features.put(NUMBER, SINGULAR);
        }
        else if (number == 'p') {
            features.put(NUMBER, PLURAL);
        }
        else if (number == 'd') {
            features.put(NUMBER, DUAL);
        }
        
        char tense = chars[3];
        if (tense == 'p') {
            features.put(TENSE, PRESENT);
        }
        else if (tense == 'i') {
            features.put(TENSE, IMPERFECT);
        }
        else if (tense == 'r') {
            features.put(TENSE, PERFECT);
        }
        else if (tense == 'l') {
            features.put(TENSE, PLUPERFECT);
        }
        else if (tense == 't') {
            features.put(TENSE, FUTURE_PERFECT);
        }
        else if (tense == 'f') {
            features.put(TENSE, FUTURE);
        }
        else if (tense == 'a') {
            features.put(TENSE, AORIST);
        }
        
        char mood = chars[4];
        if (mood == 'i') {
            features.put(MOOD, INDICATIVE);
        }
        else if (mood == 's') {
            features.put(MOOD, SUBJUNCTIVE);
        }
        else if (mood == 'n') {
            features.put(MOOD, INFINITIVE);
        }
        else if (mood == 'm') {
            features.put(MOOD, IMPERATIVE);
        }
        else if (mood == 'g') {
            features.put(MOOD, GERUNDIVE);
        }
        
        char voice = chars[5];
        if (voice == 'a') {
            features.put(VOICE, ACTIVE);
        }
        else if (voice == 'p') {
            features.put(VOICE, PASSIVE);
        }
        else if (voice == 'd') {
            features.put(VOICE, DEPONENT);
        }
        else if (voice == 'e') {
            features.put(VOICE, MEDIO_PASSIVE);
        }
        
        char gender = chars[6];
        if (gender == 'm') {
            features.put(GENDER, MASCULINE);
        }
        else if (gender == 'f') {
            features.put(GENDER, FEMININE);
        }
        else if (gender == 'n') {
            features.put(GENDER, NEUTER);
        }
        
        // CASE is a reserved word
        char caseLetter = chars[7];
        if (caseLetter == 'n') {
            features.put(CASE, NOMINATIVE);
        }
        else if (caseLetter == 'g') {
            features.put(CASE, GENITIVE);
        }
        else if (caseLetter == 'd') {
            features.put(CASE, DATIVE);
        }
        else if (caseLetter == 'a') {
            features.put(CASE, ACCUSATIVE);
        }
        else if (caseLetter == 'b') {
            features.put(CASE, ABLATIVE);
        }
        else if (caseLetter == 'v') {
            features.put(CASE, VOCATIVE);
        }
        else if (caseLetter == 'i') {
            features.put(CASE, INSTRUMENTAL);
        }
        else if (caseLetter == 'l') {
            features.put(CASE, LOCATIVE);
        }
        
        char degree = chars[8];
        if (degree == 'p') {
            features.put(DEGREE, POSITIVE);
        }
        else if (degree == 'c') {
            features.put(DEGREE, COMPARATIVE);
        }
        else if (degree == 's') {
            features.put(DEGREE, SUPERLATIVE);
        }
        
	return features;
    }
}
