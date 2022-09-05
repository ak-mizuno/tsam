-- category
INSERT INTO public.category(
	id, name)
	VALUES ('01', 'コンパクト');

INSERT INTO public.category(
	id, name)
	VALUES ('02', 'ミニバン');

INSERT INTO public.category(
	id, name)
	VALUES ('03', 'セダン');

INSERT INTO public.category(
	id, name)
	VALUES ('04', 'ワゴン');

INSERT INTO public.category(
	id, name)
	VALUES ('05', 'SUV');

INSERT INTO public.category(
	id, name)
	VALUES ('06', 'スポーツ');

INSERT INTO public.category(
	id, name)
	VALUES ('07', 'GR');

INSERT INTO public.category(
	id, name)
	VALUES ('08', '軽自動車');

INSERT INTO public.category(
	id, name)
	VALUES ('09', '小型モビリティ');


-- car
INSERT INTO public.car(
	id, category_id, name, grade, color, price, fuel_cost)
	VALUES ('0001', '01', 'a', 'Z (2WD)', 'プラチナホワイト', 2400000, 34);

INSERT INTO public.car(
	id, category_id, name, grade, color, price, fuel_cost)
	VALUES ('0002', '01', 'b', 'Z (2WD)', 'シルバーメタリック', 2400000, 34);

INSERT INTO public.car(
	id, category_id, name, grade, color, price, fuel_cost)
	VALUES ('0003', '01', 'c', 'Z (2WD)', 'ブラックマイカ', 2400000, 34);

INSERT INTO public.car(
	id, category_id, name, grade, color, price, fuel_cost)
	VALUES ('0004', '01', 'd', 'Z (2WD)', 'レッド', 2400000, 34);

INSERT INTO public.car(
	id, category_id, name, grade, color, price, fuel_cost)
	VALUES ('0005', '01', 'e', 'Z (2WD)', 'クリアベージュ', 2400000, 34);

INSERT INTO public.car(
	id, category_id, name, grade, color, price, fuel_cost)
	VALUES ('0006', '01', 'f', 'G (2WD)', 'プラチナホワイト', 2230000, 34);

INSERT INTO public.car(
	id, category_id, name, grade, color, price, fuel_cost)
	VALUES ('0007', '01', 'g', 'G (2WD)', 'シルバーメタリック', 2230000, 34);

INSERT INTO public.car(
	id, category_id, name, grade, color, price, fuel_cost)
	VALUES ('0008', '01', 'h', 'G (2WD)', 'ブラックマイカ', 2230000, 34);

INSERT INTO public.car(
	id, category_id, name, grade, color, price, fuel_cost)
	VALUES ('0009', '01', 'i', 'G (2WD)', 'レッド', 2230000	, 34);

INSERT INTO public.car(
	id, category_id, name, grade, color, price, fuel_cost)
	VALUES ('0010', '01', 'j', '6MT', 'レッド', 2169000, 34);

INSERT INTO public.car(
	id, category_id, name, grade, color, price, fuel_cost)
	VALUES ('0011', '01', 'k', '6MT', 'ホワイト', 2169000, 34);

INSERT INTO public.car(
	id, category_id, name, grade, color, price, fuel_cost)
	VALUES ('0012', '02', 'n', 'X(2WD)', 'シルバー', 3597000, 11);
