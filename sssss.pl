symptom('half headache', migraine).
symptom(nausea, migraine).
symptom('half headache,nausea', migraine).
symptom(headache, 'tension headache').
symptom('stiff neck', 'tension headache').
symptom('flu,cough,body pain', fever).
symptom(flu, fever).
symptom(cough, fever).
symptom('flu,cough', fever).
symptom('flu,cough,body pain', fever).
symptom('cough,breathlessness', pneumonia).
symptom('sore throat', 'strep throat').
symptom('hoarse voice', 'strep throat').
symptom(fatigue, anemia).
symptom(weakness,anemia).
symptom('fatigue,weakness', anemia).
symptom('sever fatigue', 'chronic fatigue syndrome').
symptom('sleeplessness', 'chronic fatigue syndrome').
symptom('sever fatigue,sleeplessness', 'chronic fatigue syndrome').
symptom(itchiness, conjunctivitis).
symptom(redness, conjuctivitis).
symptom('discharge of tearing from eyes', conjuctivitis).
symptom(diarrhoea, gastroenteritis).
symptom(vomiting, gastroenteritis).
symptom('stomach pain', gastroenteritis).
symptom('diarrhoea,vomiting', gastroenteritis).
symptom('diarrhoea,vomiting,stomach pain', gastroenteritis).
symptom('throat pain', mums).
symptom('stiffness in joints', ankylosis).
symptom('pain in joints', ankylosis).
symptom('swelling in joints', ankylosis).
symptom('inflammation in joints', ankylosis).
symptom('stiffness,pain in joints', ankylosis).
symptom('pain,inflammation in joints', ankylosis).
symptom('swelling,inflammation,pain', ankylosis).
symptom('heart attack', 'high cholestrol').
symptom('excess mucus', 'lung infection').
symptom('chest pain', 'lung infection').
symptom('chest pain,excess mucus', 'lung infection').
symptom('excessive sweating', hyperhidrosis).

symptom_match(Symptom, Disease) :- symptom(Symptom, Disease).

disease(migraine, ibuprofen).
disease('tension headache', aspirin).
disease(fever, 'rest and fluids').
disease(pneumonia, antibiotics).
disease('strep throat', antibiotics).
disease(anemia, 'iron supplements').
disease('chronic fatigue syndrome', 'cognitive behavioral therapy').
disease(conjunctivitis, 'use eyedrops Zovirax or Viroptic').
disease(gastroenteritis, 'imodium and pepto bismol antibiotics').
disease('high cholestrol', statins).
disease('lung infection','getting lots of rest, drinking plenty of fluids, take medicines,clarithromycin, levofloxacin, and amoxicillin').

disease_match(Disease, Treatment) :- disease(Disease, Treatment).

